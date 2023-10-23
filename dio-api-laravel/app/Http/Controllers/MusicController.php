<?php

namespace App\Http\Controllers;

use Illuminate\Http\JsonResponse;

class MusicController extends Controller
{
    public function getAllMusic(): JsonResponse
    {
        $musics = array(
            "Pink floyd" => "Another break in the wall",
            "ACDC" => "Back in black",
        );

        return response()->json($musics, 200);
    }

}
