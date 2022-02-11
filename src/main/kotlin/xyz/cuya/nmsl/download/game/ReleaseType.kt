/*
 * Copyright 2022-2022 purofle <purofle@qq.com> and contributors.
 *
 *   Use of this source code is governed by the GNU AGPLv3 license that can be found through the following link.
 *
 *   https://github.com/purofle/NMSLCore/blob/main/LICENSE
 */

package xyz.cuya.nmsl.download.game

enum class ReleaseType(val id: String) {
    RELEASE("release"),
    SNAPSHOT("snapshot"),
    MODIFIED("modified"),
    OLD_BETA("old-beta"),
    OLD_ALPHA("old-alpha"), UNKNOWN(
        "unknown"
    );
}