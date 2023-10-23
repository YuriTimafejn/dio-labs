<?php

namespace App\Http\Controllers;

use App\Models\Band;
use Illuminate\Http\JsonResponse;
use Illuminate\Http\Request;

class MusicController extends Controller
{
    public function create(Request $request)
    {
        return Band::create($request->all());

    }
    public function getAll(): JsonResponse
    {
        $musics = array(
            "Pink floyd" => "Another break in the wall",
            "ACDC" => "Back in black",
        );

        return response()->json($musics, 200);
    }

    // todo: getById($id) [READ]
    // todo: getByGender($gender) [READ]
    // todo: saveNewBand() [CREATE]
    // todo: delete($id) [DELETE]
    // todo: update($id) [UPDATE]
}
