/*
 * Copyright 2022-2022 purofle <purofle@qq.com> and contributors.
 *
 *   Use of this source code is governed by the GNU AGPLv3 license that can be found through the following link.
 *
 *   https://github.com/purofle/NMSLCore/blob/master/LICENSE
 */

package xyz.cuya.nmsl.download.game

import kotlinx.serialization.Serializable
import xyz.cuya.nmsl.download.game.serializer.RuledArgumentSerializer

@Serializable(with = RuledArgumentSerializer::class)
data class RuledArgument(
    val a: String
)
