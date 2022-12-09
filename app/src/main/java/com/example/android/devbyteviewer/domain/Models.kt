/*
 * Copyright (C) 2019 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.devbyteviewer.domain

import com.example.android.devbyteviewer.util.smartTruncate

/**
 * Objek domain adalah class data yang mewakili hal di aplikasi. Ini adalah
 * objek yang harus ditampilkan di layar oleh aplikasi.
 *
 * @see database untuk objek yang dipetakan ke database
 * @see network untuk objek yang mengurai atau menyiapkan panggilan jaringan
 */

/**
 * Video mewakili devbyte yang dapat diputar.
 */
data class DevByteVideo(val title: String,
                        val description: String,
                        val url: String,
                        val updated: String,
                        val thumbnail: String) {

    /**
     * shortDescription digunakan untuk menampilkan deskripsi terpotong di UI
     */
    val shortDescription: String
        get() = description.smartTruncate(200)
}