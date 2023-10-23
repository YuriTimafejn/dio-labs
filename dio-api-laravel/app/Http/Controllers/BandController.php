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
            'gender' => $request->input('gender')
        ]);
        return response()->json($band, 201);
    }
    public function all(): JsonResponse
    {
        return response()->json(Band::all(), 200);
    }

    public function find($id)
    {
        return Band::findOrFail($id);
    }

    public function listByGender($gender)
    {

    }

    public function update($id)
    {

    }

    public function delete($id)
    {

    }
}
