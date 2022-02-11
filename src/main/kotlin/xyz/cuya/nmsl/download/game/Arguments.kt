/*
 * Copyright 2022-2022 purofle <purofle@qq.com> and contributors.
 *
 *   Use of this source code is governed by the GNU AGPLv3 license that can be found through the following link.
 *
 *   https://github.com/purofle/NMSLCore/blob/main/LICENSE
 */

package xyz.cuya.nmsl.download.game

import kotlinx.serialization.Serializable

@Serializable
data class Arguments(
    val game: List<Argument>,
    val jvm: List<Argument>
)
