<?php

namespace App\Http\Controllers;

use App\Models\Band;
use Illuminate\Http\JsonResponse;
use Illuminate\Http\Request;

class BandController extends Controller
{
    public function insert(Request $request): JsonResponse
    {
        $request->validate([
            'band' => 'required|string',
            'gender' => 'required|string'
        ]);

        $band = Band::create([
            'band' => $request->input('band'),
            'gender' => strtoupper($request->input('gender'))
        ]);
        return response()->json($band, 201);
    }
    public function all(): JsonResponse
    {
        return response()->json(Band::all(), 200);
    }

    public function find($id)
    {
        return response()->json(Band::findOrFail($id), 200);
    }

    //TODO: Corrigir a questão dos parametros da URL
    public function listByGender($gender)
    {
        $bands = Band::where('gender', '=', strtoupper($gender))->get();
        return response()->json($bands, 200);
    }

    public function update(Request $request, $id)
    {
        $band = Band::findOrFail($id);

        $band->update([
            'band' => $request->input('band'),
            'gender' => strtoupper($request->input('gender'))
        ]);

        return response()->json($band, 200);
    }

    public function delete($id)
    {
        $band = Band::findOrFail($id);

        $band->delete();

        return response('', 204);
    }
}
