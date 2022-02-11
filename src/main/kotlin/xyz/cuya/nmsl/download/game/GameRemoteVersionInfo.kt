/*
 * Copyright 2022-2022 purofle <purofle@qq.com> and contributors.
 *
 *   Use of this source code is governed by the GNU AGPLv3 license that can be found through the following link.
 *
 *   https://github.com/purofle/NMSLCore/blob/main/LICENSE
 */

@file:Suppress("SERIALIZER_TYPE_INCOMPATIBLE")

package xyz.cuya.nmsl.download.game

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import xyz.cuya.nmsl.download.game.serializer.DateSerializer
import java.time.LocalDateTime

@Serializable(with = DateSerializer::class)
data class GameRemoteVersionInfo(
    @SerialName("id") val gameVersion: String,
    val type: ReleaseType,
    val url: String,
    val time: LocalDateTime,
    val releaseTime: LocalDateTime
)