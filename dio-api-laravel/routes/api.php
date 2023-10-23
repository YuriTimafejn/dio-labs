<?php

use App\Http\Controllers\BandController;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\Route;

//Route::middleware('auth:sanctum')->get('/user', function (Request $request) {
//    return $request->user();
//});

Route::prefix('v1')->group(function () {
    Route::post('bands', [BandController::class, 'insert']);
    Route::get('bands', [BandController::class, 'all']);
    Route::get('bands/{id}', [BandController::class, 'find']);
    Route::get('bands/{gender}', [BandController::class, 'listByGender']);
    Route::put('bands/{id}', [BandController::class, 'update']);
    Route::delete('bands/{id}', [BandController::class, 'delete']);
});
