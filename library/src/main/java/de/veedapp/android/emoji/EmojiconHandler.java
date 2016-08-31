/*
 * Copyright 2014 Hieu Rocker
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.veedapp.android.emoji;

import android.content.Context;
import android.text.Spannable;
import android.util.SparseIntArray;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Hieu Rocker (rockerhieu@gmail.com)
 */
public final class EmojiconHandler {
    private EmojiconHandler() {
    }

    private static final SparseIntArray sEmojisMap = new SparseIntArray(1029);
    private static final SparseIntArray sSoftbanksMap = new SparseIntArray(471);
    private static final SparseIntArray sEmojiModifiersMap = new SparseIntArray(5);
    private static Map<String, Integer> sEmojisModifiedMap = new HashMap<>();
    
    static {
        sEmojiModifiersMap.put(0x1f3fb, 1);
        sEmojiModifiersMap.put(0x1f3fc, 1);
        sEmojiModifiersMap.put(0x1f3fd, 1);
        sEmojiModifiersMap.put(0x1f3fe, 1);
        sEmojiModifiersMap.put(0x1f3ff, 1);
    }

    static {
        // People
        sEmojisMap.put(0x1f604, de.veedapp.emojicon.R.drawable.emoji_1f604);
        sEmojisMap.put(0x1f603, de.veedapp.emojicon.R.drawable.emoji_1f603);
        sEmojisMap.put(0x1f600, de.veedapp.emojicon.R.drawable.emoji_1f600);
        sEmojisMap.put(0x1f60a, de.veedapp.emojicon.R.drawable.emoji_1f60a);
        sEmojisMap.put(0x263a, de.veedapp.emojicon.R.drawable.emoji_263a);
        sEmojisMap.put(0x1f609, de.veedapp.emojicon.R.drawable.emoji_1f609);
        sEmojisMap.put(0x1f60d, de.veedapp.emojicon.R.drawable.emoji_1f60d);
        sEmojisMap.put(0x1f618, de.veedapp.emojicon.R.drawable.emoji_1f618);
        sEmojisMap.put(0x1f61a, de.veedapp.emojicon.R.drawable.emoji_1f61a);
        sEmojisMap.put(0x1f617, de.veedapp.emojicon.R.drawable.emoji_1f617);
        sEmojisMap.put(0x1f619, de.veedapp.emojicon.R.drawable.emoji_1f619);
        sEmojisMap.put(0x1f61c, de.veedapp.emojicon.R.drawable.emoji_1f61c);
        sEmojisMap.put(0x1f61d, de.veedapp.emojicon.R.drawable.emoji_1f61d);
        sEmojisMap.put(0x1f61b, de.veedapp.emojicon.R.drawable.emoji_1f61b);
        sEmojisMap.put(0x1f633, de.veedapp.emojicon.R.drawable.emoji_1f633);
        sEmojisMap.put(0x1f601, de.veedapp.emojicon.R.drawable.emoji_1f601);
        sEmojisMap.put(0x1f614, de.veedapp.emojicon.R.drawable.emoji_1f614);
        sEmojisMap.put(0x1f60c, de.veedapp.emojicon.R.drawable.emoji_1f60c);
        sEmojisMap.put(0x1f612, de.veedapp.emojicon.R.drawable.emoji_1f612);
        sEmojisMap.put(0x1f61e, de.veedapp.emojicon.R.drawable.emoji_1f61e);
        sEmojisMap.put(0x1f623, de.veedapp.emojicon.R.drawable.emoji_1f623);
        sEmojisMap.put(0x1f622, de.veedapp.emojicon.R.drawable.emoji_1f622);
        sEmojisMap.put(0x1f602, de.veedapp.emojicon.R.drawable.emoji_1f602);
        sEmojisMap.put(0x1f62d, de.veedapp.emojicon.R.drawable.emoji_1f62d);
        sEmojisMap.put(0x1f62a, de.veedapp.emojicon.R.drawable.emoji_1f62a);
        sEmojisMap.put(0x1f625, de.veedapp.emojicon.R.drawable.emoji_1f625);
        sEmojisMap.put(0x1f630, de.veedapp.emojicon.R.drawable.emoji_1f630);
        sEmojisMap.put(0x1f605, de.veedapp.emojicon.R.drawable.emoji_1f605);
        sEmojisMap.put(0x1f613, de.veedapp.emojicon.R.drawable.emoji_1f613);
        sEmojisMap.put(0x1f629, de.veedapp.emojicon.R.drawable.emoji_1f629);
        sEmojisMap.put(0x1f62b, de.veedapp.emojicon.R.drawable.emoji_1f62b);
        sEmojisMap.put(0x1f628, de.veedapp.emojicon.R.drawable.emoji_1f628);
        sEmojisMap.put(0x1f631, de.veedapp.emojicon.R.drawable.emoji_1f631);
        sEmojisMap.put(0x1f620, de.veedapp.emojicon.R.drawable.emoji_1f620);
        sEmojisMap.put(0x1f621, de.veedapp.emojicon.R.drawable.emoji_1f621);
        sEmojisMap.put(0x1f624, de.veedapp.emojicon.R.drawable.emoji_1f624);
        sEmojisMap.put(0x1f616, de.veedapp.emojicon.R.drawable.emoji_1f616);
        sEmojisMap.put(0x1f606, de.veedapp.emojicon.R.drawable.emoji_1f606);
        sEmojisMap.put(0x1f60b, de.veedapp.emojicon.R.drawable.emoji_1f60b);
        sEmojisMap.put(0x1f637, de.veedapp.emojicon.R.drawable.emoji_1f637);
        sEmojisMap.put(0x1f60e, de.veedapp.emojicon.R.drawable.emoji_1f60e);
        sEmojisMap.put(0x1f634, de.veedapp.emojicon.R.drawable.emoji_1f634);
        sEmojisMap.put(0x1f635, de.veedapp.emojicon.R.drawable.emoji_1f635);
        sEmojisMap.put(0x1f632, de.veedapp.emojicon.R.drawable.emoji_1f632);
        sEmojisMap.put(0x1f61f, de.veedapp.emojicon.R.drawable.emoji_1f61f);
        sEmojisMap.put(0x1f626, de.veedapp.emojicon.R.drawable.emoji_1f626);
        sEmojisMap.put(0x1f627, de.veedapp.emojicon.R.drawable.emoji_1f627);
        sEmojisMap.put(0x1f608, de.veedapp.emojicon.R.drawable.emoji_1f608);
        sEmojisMap.put(0x1f47f, de.veedapp.emojicon.R.drawable.emoji_1f47f);
        sEmojisMap.put(0x1f62e, de.veedapp.emojicon.R.drawable.emoji_1f62e);
        sEmojisMap.put(0x1f62c, de.veedapp.emojicon.R.drawable.emoji_1f62c);
        sEmojisMap.put(0x1f610, de.veedapp.emojicon.R.drawable.emoji_1f610);
        sEmojisMap.put(0x1f615, de.veedapp.emojicon.R.drawable.emoji_1f615);
        sEmojisMap.put(0x1f62f, de.veedapp.emojicon.R.drawable.emoji_1f62f);
        sEmojisMap.put(0x1f636, de.veedapp.emojicon.R.drawable.emoji_1f636);
        sEmojisMap.put(0x1f607, de.veedapp.emojicon.R.drawable.emoji_1f607);
        sEmojisMap.put(0x1f60f, de.veedapp.emojicon.R.drawable.emoji_1f60f);
        sEmojisMap.put(0x1f611, de.veedapp.emojicon.R.drawable.emoji_1f611);
        sEmojisMap.put(0x1f472, de.veedapp.emojicon.R.drawable.emoji_1f472);
        sEmojisMap.put(0x1f473, de.veedapp.emojicon.R.drawable.emoji_1f473);
        sEmojisMap.put(0x1f46e, de.veedapp.emojicon.R.drawable.emoji_1f46e);
        sEmojisMap.put(0x1f477, de.veedapp.emojicon.R.drawable.emoji_1f477);
        sEmojisMap.put(0x1f482, de.veedapp.emojicon.R.drawable.emoji_1f482);
        sEmojisMap.put(0x1f476, de.veedapp.emojicon.R.drawable.emoji_1f476);
        sEmojisMap.put(0x1f466, de.veedapp.emojicon.R.drawable.emoji_1f466);
        sEmojisMap.put(0x1f467, de.veedapp.emojicon.R.drawable.emoji_1f467);
        sEmojisMap.put(0x1f468, de.veedapp.emojicon.R.drawable.emoji_1f468);
        sEmojisMap.put(0x1f469, de.veedapp.emojicon.R.drawable.emoji_1f469);
        sEmojisMap.put(0x1f474, de.veedapp.emojicon.R.drawable.emoji_1f474);
        sEmojisMap.put(0x1f475, de.veedapp.emojicon.R.drawable.emoji_1f475);
        sEmojisMap.put(0x1f471, de.veedapp.emojicon.R.drawable.emoji_1f471);
        sEmojisMap.put(0x1f47c, de.veedapp.emojicon.R.drawable.emoji_1f47c);
        sEmojisMap.put(0x1f478, de.veedapp.emojicon.R.drawable.emoji_1f478);
        sEmojisMap.put(0x1f63a, de.veedapp.emojicon.R.drawable.emoji_1f63a);
        sEmojisMap.put(0x1f638, de.veedapp.emojicon.R.drawable.emoji_1f638);
        sEmojisMap.put(0x1f63b, de.veedapp.emojicon.R.drawable.emoji_1f63b);
        sEmojisMap.put(0x1f63d, de.veedapp.emojicon.R.drawable.emoji_1f63d);
        sEmojisMap.put(0x1f63c, de.veedapp.emojicon.R.drawable.emoji_1f63c);
        sEmojisMap.put(0x1f640, de.veedapp.emojicon.R.drawable.emoji_1f640);
        sEmojisMap.put(0x1f63f, de.veedapp.emojicon.R.drawable.emoji_1f63f);
        sEmojisMap.put(0x1f639, de.veedapp.emojicon.R.drawable.emoji_1f639);
        sEmojisMap.put(0x1f63e, de.veedapp.emojicon.R.drawable.emoji_1f63e);
        sEmojisMap.put(0x1f479, de.veedapp.emojicon.R.drawable.emoji_1f479);
        sEmojisMap.put(0x1f47a, de.veedapp.emojicon.R.drawable.emoji_1f47a);
        sEmojisMap.put(0x1f648, de.veedapp.emojicon.R.drawable.emoji_1f648);
        sEmojisMap.put(0x1f649, de.veedapp.emojicon.R.drawable.emoji_1f649);
        sEmojisMap.put(0x1f64a, de.veedapp.emojicon.R.drawable.emoji_1f64a);
        sEmojisMap.put(0x1f480, de.veedapp.emojicon.R.drawable.emoji_1f480);
        sEmojisMap.put(0x1f47d, de.veedapp.emojicon.R.drawable.emoji_1f47d);
        sEmojisMap.put(0x1f4a9, de.veedapp.emojicon.R.drawable.emoji_1f4a9);
        sEmojisMap.put(0x1f525, de.veedapp.emojicon.R.drawable.emoji_1f525);
        sEmojisMap.put(0x2728, de.veedapp.emojicon.R.drawable.emoji_2728);
        sEmojisMap.put(0x1f31f, de.veedapp.emojicon.R.drawable.emoji_1f31f);
        sEmojisMap.put(0x1f4ab, de.veedapp.emojicon.R.drawable.emoji_1f4ab);
        sEmojisMap.put(0x1f4a5, de.veedapp.emojicon.R.drawable.emoji_1f4a5);
        sEmojisMap.put(0x1f4a2, de.veedapp.emojicon.R.drawable.emoji_1f4a2);
        sEmojisMap.put(0x1f4a6, de.veedapp.emojicon.R.drawable.emoji_1f4a6);
        sEmojisMap.put(0x1f4a7, de.veedapp.emojicon.R.drawable.emoji_1f4a7);
        sEmojisMap.put(0x1f4a4, de.veedapp.emojicon.R.drawable.emoji_1f4a4);
        sEmojisMap.put(0x1f4a8, de.veedapp.emojicon.R.drawable.emoji_1f4a8);
        sEmojisMap.put(0x1f442, de.veedapp.emojicon.R.drawable.emoji_1f442);
        sEmojisMap.put(0x1f440, de.veedapp.emojicon.R.drawable.emoji_1f440);
        sEmojisMap.put(0x1f443, de.veedapp.emojicon.R.drawable.emoji_1f443);
        sEmojisMap.put(0x1f445, de.veedapp.emojicon.R.drawable.emoji_1f445);
        sEmojisMap.put(0x1f444, de.veedapp.emojicon.R.drawable.emoji_1f444);
        sEmojisMap.put(0x1f44d, de.veedapp.emojicon.R.drawable.emoji_1f44d);
        sEmojisMap.put(0x1f44e, de.veedapp.emojicon.R.drawable.emoji_1f44e);
        sEmojisMap.put(0x1f44c, de.veedapp.emojicon.R.drawable.emoji_1f44c);
        sEmojisMap.put(0x1f44a, de.veedapp.emojicon.R.drawable.emoji_1f44a);
        sEmojisMap.put(0x270a, de.veedapp.emojicon.R.drawable.emoji_270a);
        sEmojisMap.put(0x270c, de.veedapp.emojicon.R.drawable.emoji_270c);
        sEmojisMap.put(0x1f44b, de.veedapp.emojicon.R.drawable.emoji_1f44b);
        sEmojisMap.put(0x270b, de.veedapp.emojicon.R.drawable.emoji_270b);
        sEmojisMap.put(0x1f450, de.veedapp.emojicon.R.drawable.emoji_1f450);
        sEmojisMap.put(0x1f446, de.veedapp.emojicon.R.drawable.emoji_1f446);
        sEmojisMap.put(0x1f447, de.veedapp.emojicon.R.drawable.emoji_1f447);
        sEmojisMap.put(0x1f449, de.veedapp.emojicon.R.drawable.emoji_1f449);
        sEmojisMap.put(0x1f448, de.veedapp.emojicon.R.drawable.emoji_1f448);
        sEmojisMap.put(0x1f64c, de.veedapp.emojicon.R.drawable.emoji_1f64c);
        sEmojisMap.put(0x1f64f, de.veedapp.emojicon.R.drawable.emoji_1f64f);
        sEmojisMap.put(0x261d, de.veedapp.emojicon.R.drawable.emoji_261d);
        sEmojisMap.put(0x1f44f, de.veedapp.emojicon.R.drawable.emoji_1f44f);
        sEmojisMap.put(0x1f4aa, de.veedapp.emojicon.R.drawable.emoji_1f4aa);
        sEmojisMap.put(0x1f6b6, de.veedapp.emojicon.R.drawable.emoji_1f6b6);
        sEmojisMap.put(0x1f3c3, de.veedapp.emojicon.R.drawable.emoji_1f3c3);
        sEmojisMap.put(0x1f483, de.veedapp.emojicon.R.drawable.emoji_1f483);
        sEmojisMap.put(0x1f46b, de.veedapp.emojicon.R.drawable.emoji_1f46b);
        sEmojisMap.put(0x1f46a, de.veedapp.emojicon.R.drawable.emoji_1f46a);
        sEmojisMap.put(0x1f46c, de.veedapp.emojicon.R.drawable.emoji_1f46c);
        sEmojisMap.put(0x1f46d, de.veedapp.emojicon.R.drawable.emoji_1f46d);
        sEmojisMap.put(0x1f48f, de.veedapp.emojicon.R.drawable.emoji_1f48f);
        sEmojisMap.put(0x1f491, de.veedapp.emojicon.R.drawable.emoji_1f491);
        sEmojisMap.put(0x1f46f, de.veedapp.emojicon.R.drawable.emoji_1f46f);
        sEmojisMap.put(0x1f646, de.veedapp.emojicon.R.drawable.emoji_1f646);
        sEmojisMap.put(0x1f645, de.veedapp.emojicon.R.drawable.emoji_1f645);
        sEmojisMap.put(0x1f481, de.veedapp.emojicon.R.drawable.emoji_1f481);
        sEmojisMap.put(0x1f64b, de.veedapp.emojicon.R.drawable.emoji_1f64b);
        sEmojisMap.put(0x1f486, de.veedapp.emojicon.R.drawable.emoji_1f486);
        sEmojisMap.put(0x1f487, de.veedapp.emojicon.R.drawable.emoji_1f487);
        sEmojisMap.put(0x1f485, de.veedapp.emojicon.R.drawable.emoji_1f485);
        sEmojisMap.put(0x1f470, de.veedapp.emojicon.R.drawable.emoji_1f470);
        sEmojisMap.put(0x1f64e, de.veedapp.emojicon.R.drawable.emoji_1f64e);
        sEmojisMap.put(0x1f64d, de.veedapp.emojicon.R.drawable.emoji_1f64d);
        sEmojisMap.put(0x1f647, de.veedapp.emojicon.R.drawable.emoji_1f647);
        sEmojisMap.put(0x1f3a9, de.veedapp.emojicon.R.drawable.emoji_1f3a9);
        sEmojisMap.put(0x1f451, de.veedapp.emojicon.R.drawable.emoji_1f451);
        sEmojisMap.put(0x1f452, de.veedapp.emojicon.R.drawable.emoji_1f452);
        sEmojisMap.put(0x1f45f, de.veedapp.emojicon.R.drawable.emoji_1f45f);
        sEmojisMap.put(0x1f45e, de.veedapp.emojicon.R.drawable.emoji_1f45e);
        sEmojisMap.put(0x1f461, de.veedapp.emojicon.R.drawable.emoji_1f461);
        sEmojisMap.put(0x1f460, de.veedapp.emojicon.R.drawable.emoji_1f460);
        sEmojisMap.put(0x1f462, de.veedapp.emojicon.R.drawable.emoji_1f462);
        sEmojisMap.put(0x1f455, de.veedapp.emojicon.R.drawable.emoji_1f455);
        sEmojisMap.put(0x1f454, de.veedapp.emojicon.R.drawable.emoji_1f454);
        sEmojisMap.put(0x1f45a, de.veedapp.emojicon.R.drawable.emoji_1f45a);
        sEmojisMap.put(0x1f457, de.veedapp.emojicon.R.drawable.emoji_1f457);
        sEmojisMap.put(0x1f3bd, de.veedapp.emojicon.R.drawable.emoji_1f3bd);
        sEmojisMap.put(0x1f456, de.veedapp.emojicon.R.drawable.emoji_1f456);
        sEmojisMap.put(0x1f458, de.veedapp.emojicon.R.drawable.emoji_1f458);
        sEmojisMap.put(0x1f459, de.veedapp.emojicon.R.drawable.emoji_1f459);
        sEmojisMap.put(0x1f4bc, de.veedapp.emojicon.R.drawable.emoji_1f4bc);
        sEmojisMap.put(0x1f45c, de.veedapp.emojicon.R.drawable.emoji_1f45c);
        sEmojisMap.put(0x1f45d, de.veedapp.emojicon.R.drawable.emoji_1f45d);
        sEmojisMap.put(0x1f45b, de.veedapp.emojicon.R.drawable.emoji_1f45b);
        sEmojisMap.put(0x1f453, de.veedapp.emojicon.R.drawable.emoji_1f453);
        sEmojisMap.put(0x1f380, de.veedapp.emojicon.R.drawable.emoji_1f380);
        sEmojisMap.put(0x1f302, de.veedapp.emojicon.R.drawable.emoji_1f302);
        sEmojisMap.put(0x1f484, de.veedapp.emojicon.R.drawable.emoji_1f484);
        sEmojisMap.put(0x1f49b, de.veedapp.emojicon.R.drawable.emoji_1f49b);
        sEmojisMap.put(0x1f499, de.veedapp.emojicon.R.drawable.emoji_1f499);
        sEmojisMap.put(0x1f49c, de.veedapp.emojicon.R.drawable.emoji_1f49c);
        sEmojisMap.put(0x1f49a, de.veedapp.emojicon.R.drawable.emoji_1f49a);
        sEmojisMap.put(0x2764, de.veedapp.emojicon.R.drawable.emoji_2764);
        sEmojisMap.put(0x1f494, de.veedapp.emojicon.R.drawable.emoji_1f494);
        sEmojisMap.put(0x1f497, de.veedapp.emojicon.R.drawable.emoji_1f497);
        sEmojisMap.put(0x1f493, de.veedapp.emojicon.R.drawable.emoji_1f493);
        sEmojisMap.put(0x1f495, de.veedapp.emojicon.R.drawable.emoji_1f495);
        sEmojisMap.put(0x1f496, de.veedapp.emojicon.R.drawable.emoji_1f496);
        sEmojisMap.put(0x1f49e, de.veedapp.emojicon.R.drawable.emoji_1f49e);
        sEmojisMap.put(0x1f498, de.veedapp.emojicon.R.drawable.emoji_1f498);
        sEmojisMap.put(0x1f48c, de.veedapp.emojicon.R.drawable.emoji_1f48c);
        sEmojisMap.put(0x1f48b, de.veedapp.emojicon.R.drawable.emoji_1f48b);
        sEmojisMap.put(0x1f48d, de.veedapp.emojicon.R.drawable.emoji_1f48d);
        sEmojisMap.put(0x1f48e, de.veedapp.emojicon.R.drawable.emoji_1f48e);
        sEmojisMap.put(0x1f464, de.veedapp.emojicon.R.drawable.emoji_1f464);
        sEmojisMap.put(0x1f465, de.veedapp.emojicon.R.drawable.emoji_1f465);
        sEmojisMap.put(0x1f4ac, de.veedapp.emojicon.R.drawable.emoji_1f4ac);
        sEmojisMap.put(0x1f463, de.veedapp.emojicon.R.drawable.emoji_1f463);
        sEmojisMap.put(0x1f4ad, de.veedapp.emojicon.R.drawable.emoji_1f4ad);

        // Nature
        sEmojisMap.put(0x1f436, de.veedapp.emojicon.R.drawable.emoji_1f436);
        sEmojisMap.put(0x1f43a, de.veedapp.emojicon.R.drawable.emoji_1f43a);
        sEmojisMap.put(0x1f431, de.veedapp.emojicon.R.drawable.emoji_1f431);
        sEmojisMap.put(0x1f42d, de.veedapp.emojicon.R.drawable.emoji_1f42d);
        sEmojisMap.put(0x1f439, de.veedapp.emojicon.R.drawable.emoji_1f439);
        sEmojisMap.put(0x1f430, de.veedapp.emojicon.R.drawable.emoji_1f430);
        sEmojisMap.put(0x1f438, de.veedapp.emojicon.R.drawable.emoji_1f438);
        sEmojisMap.put(0x1f42f, de.veedapp.emojicon.R.drawable.emoji_1f42f);
        sEmojisMap.put(0x1f428, de.veedapp.emojicon.R.drawable.emoji_1f428);
        sEmojisMap.put(0x1f43b, de.veedapp.emojicon.R.drawable.emoji_1f43b);
        sEmojisMap.put(0x1f437, de.veedapp.emojicon.R.drawable.emoji_1f437);
        sEmojisMap.put(0x1f43d, de.veedapp.emojicon.R.drawable.emoji_1f43d);
        sEmojisMap.put(0x1f42e, de.veedapp.emojicon.R.drawable.emoji_1f42e);
        sEmojisMap.put(0x1f417, de.veedapp.emojicon.R.drawable.emoji_1f417);
        sEmojisMap.put(0x1f435, de.veedapp.emojicon.R.drawable.emoji_1f435);
        sEmojisMap.put(0x1f412, de.veedapp.emojicon.R.drawable.emoji_1f412);
        sEmojisMap.put(0x1f434, de.veedapp.emojicon.R.drawable.emoji_1f434);
        sEmojisMap.put(0x1f411, de.veedapp.emojicon.R.drawable.emoji_1f411);
        sEmojisMap.put(0x1f418, de.veedapp.emojicon.R.drawable.emoji_1f418);
        sEmojisMap.put(0x1f43c, de.veedapp.emojicon.R.drawable.emoji_1f43c);
        sEmojisMap.put(0x1f427, de.veedapp.emojicon.R.drawable.emoji_1f427);
        sEmojisMap.put(0x1f426, de.veedapp.emojicon.R.drawable.emoji_1f426);
        sEmojisMap.put(0x1f424, de.veedapp.emojicon.R.drawable.emoji_1f424);
        sEmojisMap.put(0x1f425, de.veedapp.emojicon.R.drawable.emoji_1f425);
        sEmojisMap.put(0x1f423, de.veedapp.emojicon.R.drawable.emoji_1f423);
        sEmojisMap.put(0x1f414, de.veedapp.emojicon.R.drawable.emoji_1f414);
        sEmojisMap.put(0x1f40d, de.veedapp.emojicon.R.drawable.emoji_1f40d);
        sEmojisMap.put(0x1f422, de.veedapp.emojicon.R.drawable.emoji_1f422);
        sEmojisMap.put(0x1f41b, de.veedapp.emojicon.R.drawable.emoji_1f41b);
        sEmojisMap.put(0x1f41d, de.veedapp.emojicon.R.drawable.emoji_1f41d);
        sEmojisMap.put(0x1f41c, de.veedapp.emojicon.R.drawable.emoji_1f41c);
        sEmojisMap.put(0x1f41e, de.veedapp.emojicon.R.drawable.emoji_1f41e);
        sEmojisMap.put(0x1f40c, de.veedapp.emojicon.R.drawable.emoji_1f40c);
        sEmojisMap.put(0x1f419, de.veedapp.emojicon.R.drawable.emoji_1f419);
        sEmojisMap.put(0x1f41a, de.veedapp.emojicon.R.drawable.emoji_1f41a);
        sEmojisMap.put(0x1f420, de.veedapp.emojicon.R.drawable.emoji_1f420);
        sEmojisMap.put(0x1f41f, de.veedapp.emojicon.R.drawable.emoji_1f41f);
        sEmojisMap.put(0x1f42c, de.veedapp.emojicon.R.drawable.emoji_1f42c);
        sEmojisMap.put(0x1f433, de.veedapp.emojicon.R.drawable.emoji_1f433);
        sEmojisMap.put(0x1f40b, de.veedapp.emojicon.R.drawable.emoji_1f40b);
        sEmojisMap.put(0x1f404, de.veedapp.emojicon.R.drawable.emoji_1f404);
        sEmojisMap.put(0x1f40f, de.veedapp.emojicon.R.drawable.emoji_1f40f);
        sEmojisMap.put(0x1f400, de.veedapp.emojicon.R.drawable.emoji_1f400);
        sEmojisMap.put(0x1f403, de.veedapp.emojicon.R.drawable.emoji_1f403);
        sEmojisMap.put(0x1f405, de.veedapp.emojicon.R.drawable.emoji_1f405);
        sEmojisMap.put(0x1f407, de.veedapp.emojicon.R.drawable.emoji_1f407);
        sEmojisMap.put(0x1f409, de.veedapp.emojicon.R.drawable.emoji_1f409);
        sEmojisMap.put(0x1f40e, de.veedapp.emojicon.R.drawable.emoji_1f40e);
        sEmojisMap.put(0x1f410, de.veedapp.emojicon.R.drawable.emoji_1f410);
        sEmojisMap.put(0x1f413, de.veedapp.emojicon.R.drawable.emoji_1f413);
        sEmojisMap.put(0x1f415, de.veedapp.emojicon.R.drawable.emoji_1f415);
        sEmojisMap.put(0x1f416, de.veedapp.emojicon.R.drawable.emoji_1f416);
        sEmojisMap.put(0x1f401, de.veedapp.emojicon.R.drawable.emoji_1f401);
        sEmojisMap.put(0x1f402, de.veedapp.emojicon.R.drawable.emoji_1f402);
        sEmojisMap.put(0x1f432, de.veedapp.emojicon.R.drawable.emoji_1f432);
        sEmojisMap.put(0x1f421, de.veedapp.emojicon.R.drawable.emoji_1f421);
        sEmojisMap.put(0x1f40a, de.veedapp.emojicon.R.drawable.emoji_1f40a);
        sEmojisMap.put(0x1f42b, de.veedapp.emojicon.R.drawable.emoji_1f42b);
        sEmojisMap.put(0x1f42a, de.veedapp.emojicon.R.drawable.emoji_1f42a);
        sEmojisMap.put(0x1f406, de.veedapp.emojicon.R.drawable.emoji_1f406);
        sEmojisMap.put(0x1f408, de.veedapp.emojicon.R.drawable.emoji_1f408);
        sEmojisMap.put(0x1f429, de.veedapp.emojicon.R.drawable.emoji_1f429);
        sEmojisMap.put(0x1f43e, de.veedapp.emojicon.R.drawable.emoji_1f43e);
        sEmojisMap.put(0x1f490, de.veedapp.emojicon.R.drawable.emoji_1f490);
        sEmojisMap.put(0x1f338, de.veedapp.emojicon.R.drawable.emoji_1f338);
        sEmojisMap.put(0x1f337, de.veedapp.emojicon.R.drawable.emoji_1f337);
        sEmojisMap.put(0x1f340, de.veedapp.emojicon.R.drawable.emoji_1f340);
        sEmojisMap.put(0x1f339, de.veedapp.emojicon.R.drawable.emoji_1f339);
        sEmojisMap.put(0x1f33b, de.veedapp.emojicon.R.drawable.emoji_1f33b);
        sEmojisMap.put(0x1f33a, de.veedapp.emojicon.R.drawable.emoji_1f33a);
        sEmojisMap.put(0x1f341, de.veedapp.emojicon.R.drawable.emoji_1f341);
        sEmojisMap.put(0x1f343, de.veedapp.emojicon.R.drawable.emoji_1f343);
        sEmojisMap.put(0x1f342, de.veedapp.emojicon.R.drawable.emoji_1f342);
        sEmojisMap.put(0x1f33f, de.veedapp.emojicon.R.drawable.emoji_1f33f);
        sEmojisMap.put(0x1f33e, de.veedapp.emojicon.R.drawable.emoji_1f33e);
        sEmojisMap.put(0x1f344, de.veedapp.emojicon.R.drawable.emoji_1f344);
        sEmojisMap.put(0x1f335, de.veedapp.emojicon.R.drawable.emoji_1f335);
        sEmojisMap.put(0x1f334, de.veedapp.emojicon.R.drawable.emoji_1f334);
        sEmojisMap.put(0x1f332, de.veedapp.emojicon.R.drawable.emoji_1f332);
        sEmojisMap.put(0x1f333, de.veedapp.emojicon.R.drawable.emoji_1f333);
        sEmojisMap.put(0x1f330, de.veedapp.emojicon.R.drawable.emoji_1f330);
        sEmojisMap.put(0x1f331, de.veedapp.emojicon.R.drawable.emoji_1f331);
        sEmojisMap.put(0x1f33c, de.veedapp.emojicon.R.drawable.emoji_1f33c);
        sEmojisMap.put(0x1f310, de.veedapp.emojicon.R.drawable.emoji_1f310);
        sEmojisMap.put(0x1f31e, de.veedapp.emojicon.R.drawable.emoji_1f31e);
        sEmojisMap.put(0x1f31d, de.veedapp.emojicon.R.drawable.emoji_1f31d);
        sEmojisMap.put(0x1f31a, de.veedapp.emojicon.R.drawable.emoji_1f31a);
        sEmojisMap.put(0x1f311, de.veedapp.emojicon.R.drawable.emoji_1f311);
        sEmojisMap.put(0x1f312, de.veedapp.emojicon.R.drawable.emoji_1f312);
        sEmojisMap.put(0x1f313, de.veedapp.emojicon.R.drawable.emoji_1f313);
        sEmojisMap.put(0x1f314, de.veedapp.emojicon.R.drawable.emoji_1f314);
        sEmojisMap.put(0x1f315, de.veedapp.emojicon.R.drawable.emoji_1f315);
        sEmojisMap.put(0x1f316, de.veedapp.emojicon.R.drawable.emoji_1f316);
        sEmojisMap.put(0x1f317, de.veedapp.emojicon.R.drawable.emoji_1f317);
        sEmojisMap.put(0x1f318, de.veedapp.emojicon.R.drawable.emoji_1f318);
        sEmojisMap.put(0x1f31c, de.veedapp.emojicon.R.drawable.emoji_1f31c);
        sEmojisMap.put(0x1f31b, de.veedapp.emojicon.R.drawable.emoji_1f31b);
        sEmojisMap.put(0x1f319, de.veedapp.emojicon.R.drawable.emoji_1f319);
        sEmojisMap.put(0x1f30d, de.veedapp.emojicon.R.drawable.emoji_1f30d);
        sEmojisMap.put(0x1f30e, de.veedapp.emojicon.R.drawable.emoji_1f30e);
        sEmojisMap.put(0x1f30f, de.veedapp.emojicon.R.drawable.emoji_1f30f);
        sEmojisMap.put(0x1f30b, de.veedapp.emojicon.R.drawable.emoji_1f30b);
        sEmojisMap.put(0x1f30c, de.veedapp.emojicon.R.drawable.emoji_1f30c);
        sEmojisMap.put(0x1f320, de.veedapp.emojicon.R.drawable.emoji_1f303); // TODO (rockerhieu) review this emoji
        sEmojisMap.put(0x2b50, de.veedapp.emojicon.R.drawable.emoji_2b50);
        sEmojisMap.put(0x2600, de.veedapp.emojicon.R.drawable.emoji_2600);
        sEmojisMap.put(0x26c5, de.veedapp.emojicon.R.drawable.emoji_26c5);
        sEmojisMap.put(0x2601, de.veedapp.emojicon.R.drawable.emoji_2601);
        sEmojisMap.put(0x26a1, de.veedapp.emojicon.R.drawable.emoji_26a1);
        sEmojisMap.put(0x2614, de.veedapp.emojicon.R.drawable.emoji_2614);
        sEmojisMap.put(0x2744, de.veedapp.emojicon.R.drawable.emoji_2744);
        sEmojisMap.put(0x26c4, de.veedapp.emojicon.R.drawable.emoji_26c4);
        sEmojisMap.put(0x1f300, de.veedapp.emojicon.R.drawable.emoji_1f300);
        sEmojisMap.put(0x1f301, de.veedapp.emojicon.R.drawable.emoji_1f301);
        sEmojisMap.put(0x1f308, de.veedapp.emojicon.R.drawable.emoji_1f308);
        sEmojisMap.put(0x1f30a, de.veedapp.emojicon.R.drawable.emoji_1f30a);

        // Objects
        sEmojisMap.put(0x1f38d, de.veedapp.emojicon.R.drawable.emoji_1f38d);
        sEmojisMap.put(0x1f49d, de.veedapp.emojicon.R.drawable.emoji_1f49d);
        sEmojisMap.put(0x1f38e, de.veedapp.emojicon.R.drawable.emoji_1f38e);
        sEmojisMap.put(0x1f392, de.veedapp.emojicon.R.drawable.emoji_1f392);
        sEmojisMap.put(0x1f393, de.veedapp.emojicon.R.drawable.emoji_1f393);
        sEmojisMap.put(0x1f38f, de.veedapp.emojicon.R.drawable.emoji_1f38f);
        sEmojisMap.put(0x1f386, de.veedapp.emojicon.R.drawable.emoji_1f386);
        sEmojisMap.put(0x1f387, de.veedapp.emojicon.R.drawable.emoji_1f387);
        sEmojisMap.put(0x1f390, de.veedapp.emojicon.R.drawable.emoji_1f390);
        sEmojisMap.put(0x1f391, de.veedapp.emojicon.R.drawable.emoji_1f391);
        sEmojisMap.put(0x1f383, de.veedapp.emojicon.R.drawable.emoji_1f383);
        sEmojisMap.put(0x1f47b, de.veedapp.emojicon.R.drawable.emoji_1f47b);
        sEmojisMap.put(0x1f385, de.veedapp.emojicon.R.drawable.emoji_1f385);
        sEmojisMap.put(0x1f384, de.veedapp.emojicon.R.drawable.emoji_1f384);
        sEmojisMap.put(0x1f381, de.veedapp.emojicon.R.drawable.emoji_1f381);
        sEmojisMap.put(0x1f38b, de.veedapp.emojicon.R.drawable.emoji_1f38b);
        sEmojisMap.put(0x1f389, de.veedapp.emojicon.R.drawable.emoji_1f389);
        sEmojisMap.put(0x1f38a, de.veedapp.emojicon.R.drawable.emoji_1f38a);
        sEmojisMap.put(0x1f388, de.veedapp.emojicon.R.drawable.emoji_1f388);
        sEmojisMap.put(0x1f38c, de.veedapp.emojicon.R.drawable.emoji_1f38c);
        sEmojisMap.put(0x1f52e, de.veedapp.emojicon.R.drawable.emoji_1f52e);
        sEmojisMap.put(0x1f3a5, de.veedapp.emojicon.R.drawable.emoji_1f3a5);
        sEmojisMap.put(0x1f4f7, de.veedapp.emojicon.R.drawable.emoji_1f4f7);
        sEmojisMap.put(0x1f4f9, de.veedapp.emojicon.R.drawable.emoji_1f4f9);
        sEmojisMap.put(0x1f4fc, de.veedapp.emojicon.R.drawable.emoji_1f4fc);
        sEmojisMap.put(0x1f4bf, de.veedapp.emojicon.R.drawable.emoji_1f4bf);
        sEmojisMap.put(0x1f4c0, de.veedapp.emojicon.R.drawable.emoji_1f4c0);
        sEmojisMap.put(0x1f4bd, de.veedapp.emojicon.R.drawable.emoji_1f4bd);
        sEmojisMap.put(0x1f4be, de.veedapp.emojicon.R.drawable.emoji_1f4be);
        sEmojisMap.put(0x1f4bb, de.veedapp.emojicon.R.drawable.emoji_1f4bb);
        sEmojisMap.put(0x1f4f1, de.veedapp.emojicon.R.drawable.emoji_1f4f1);
        sEmojisMap.put(0x260e, de.veedapp.emojicon.R.drawable.emoji_260e);
        sEmojisMap.put(0x1f4de, de.veedapp.emojicon.R.drawable.emoji_1f4de);
        sEmojisMap.put(0x1f4df, de.veedapp.emojicon.R.drawable.emoji_1f4df);
        sEmojisMap.put(0x1f4e0, de.veedapp.emojicon.R.drawable.emoji_1f4e0);
        sEmojisMap.put(0x1f4e1, de.veedapp.emojicon.R.drawable.emoji_1f4e1);
        sEmojisMap.put(0x1f4fa, de.veedapp.emojicon.R.drawable.emoji_1f4fa);
        sEmojisMap.put(0x1f4fb, de.veedapp.emojicon.R.drawable.emoji_1f4fb);
        sEmojisMap.put(0x1f50a, de.veedapp.emojicon.R.drawable.emoji_1f50a);
        sEmojisMap.put(0x1f509, de.veedapp.emojicon.R.drawable.emoji_1f509);
        sEmojisMap.put(0x1f508, de.veedapp.emojicon.R.drawable.emoji_1f508); // TODO (rockerhieu): review this emoji
        sEmojisMap.put(0x1f507, de.veedapp.emojicon.R.drawable.emoji_1f507);
        sEmojisMap.put(0x1f514, de.veedapp.emojicon.R.drawable.emoji_1f514);
        sEmojisMap.put(0x1f515, de.veedapp.emojicon.R.drawable.emoji_1f515);
        sEmojisMap.put(0x1f4e2, de.veedapp.emojicon.R.drawable.emoji_1f4e2);
        sEmojisMap.put(0x1f4e3, de.veedapp.emojicon.R.drawable.emoji_1f4e3);
        sEmojisMap.put(0x23f3, de.veedapp.emojicon.R.drawable.emoji_23f3);
        sEmojisMap.put(0x231b, de.veedapp.emojicon.R.drawable.emoji_231b);
        sEmojisMap.put(0x23f0, de.veedapp.emojicon.R.drawable.emoji_23f0);
        sEmojisMap.put(0x231a, de.veedapp.emojicon.R.drawable.emoji_231a);
        sEmojisMap.put(0x1f513, de.veedapp.emojicon.R.drawable.emoji_1f513);
        sEmojisMap.put(0x1f512, de.veedapp.emojicon.R.drawable.emoji_1f512);
        sEmojisMap.put(0x1f50f, de.veedapp.emojicon.R.drawable.emoji_1f50f);
        sEmojisMap.put(0x1f510, de.veedapp.emojicon.R.drawable.emoji_1f510);
        sEmojisMap.put(0x1f511, de.veedapp.emojicon.R.drawable.emoji_1f511);
        sEmojisMap.put(0x1f50e, de.veedapp.emojicon.R.drawable.emoji_1f50e);
        sEmojisMap.put(0x1f4a1, de.veedapp.emojicon.R.drawable.emoji_1f4a1);
        sEmojisMap.put(0x1f526, de.veedapp.emojicon.R.drawable.emoji_1f526);
        sEmojisMap.put(0x1f506, de.veedapp.emojicon.R.drawable.emoji_1f506);
        sEmojisMap.put(0x1f505, de.veedapp.emojicon.R.drawable.emoji_1f505);
        sEmojisMap.put(0x1f50c, de.veedapp.emojicon.R.drawable.emoji_1f50c);
        sEmojisMap.put(0x1f50b, de.veedapp.emojicon.R.drawable.emoji_1f50b);
        sEmojisMap.put(0x1f50d, de.veedapp.emojicon.R.drawable.emoji_1f50d);
        sEmojisMap.put(0x1f6c1, de.veedapp.emojicon.R.drawable.emoji_1f6c1);
        sEmojisMap.put(0x1f6c0, de.veedapp.emojicon.R.drawable.emoji_1f6c0);
        sEmojisMap.put(0x1f6bf, de.veedapp.emojicon.R.drawable.emoji_1f6bf);
        sEmojisMap.put(0x1f6bd, de.veedapp.emojicon.R.drawable.emoji_1f6bd);
        sEmojisMap.put(0x1f527, de.veedapp.emojicon.R.drawable.emoji_1f527);
        sEmojisMap.put(0x1f529, de.veedapp.emojicon.R.drawable.emoji_1f529);
        sEmojisMap.put(0x1f528, de.veedapp.emojicon.R.drawable.emoji_1f528);
        sEmojisMap.put(0x1f6aa, de.veedapp.emojicon.R.drawable.emoji_1f6aa);
        sEmojisMap.put(0x1f6ac, de.veedapp.emojicon.R.drawable.emoji_1f6ac);
        sEmojisMap.put(0x1f4a3, de.veedapp.emojicon.R.drawable.emoji_1f4a3);
        sEmojisMap.put(0x1f52b, de.veedapp.emojicon.R.drawable.emoji_1f52b);
        sEmojisMap.put(0x1f52a, de.veedapp.emojicon.R.drawable.emoji_1f52a);
        sEmojisMap.put(0x1f48a, de.veedapp.emojicon.R.drawable.emoji_1f48a);
        sEmojisMap.put(0x1f489, de.veedapp.emojicon.R.drawable.emoji_1f489);
        sEmojisMap.put(0x1f4b0, de.veedapp.emojicon.R.drawable.emoji_1f4b0);
        sEmojisMap.put(0x1f4b4, de.veedapp.emojicon.R.drawable.emoji_1f4b4);
        sEmojisMap.put(0x1f4b5, de.veedapp.emojicon.R.drawable.emoji_1f4b5);
        sEmojisMap.put(0x1f4b7, de.veedapp.emojicon.R.drawable.emoji_1f4b7);
        sEmojisMap.put(0x1f4b6, de.veedapp.emojicon.R.drawable.emoji_1f4b6);
        sEmojisMap.put(0x1f4b3, de.veedapp.emojicon.R.drawable.emoji_1f4b3);
        sEmojisMap.put(0x1f4b8, de.veedapp.emojicon.R.drawable.emoji_1f4b8);
        sEmojisMap.put(0x1f4f2, de.veedapp.emojicon.R.drawable.emoji_1f4f2);
        sEmojisMap.put(0x1f4e7, de.veedapp.emojicon.R.drawable.emoji_1f4e7);
        sEmojisMap.put(0x1f4e5, de.veedapp.emojicon.R.drawable.emoji_1f4e5);
        sEmojisMap.put(0x1f4e4, de.veedapp.emojicon.R.drawable.emoji_1f4e4);
        sEmojisMap.put(0x2709, de.veedapp.emojicon.R.drawable.emoji_2709);
        sEmojisMap.put(0x1f4e9, de.veedapp.emojicon.R.drawable.emoji_1f4e9);
        sEmojisMap.put(0x1f4e8, de.veedapp.emojicon.R.drawable.emoji_1f4e8);
        sEmojisMap.put(0x1f4ef, de.veedapp.emojicon.R.drawable.emoji_1f4ef);
        sEmojisMap.put(0x1f4eb, de.veedapp.emojicon.R.drawable.emoji_1f4eb);
        sEmojisMap.put(0x1f4ea, de.veedapp.emojicon.R.drawable.emoji_1f4ea);
        sEmojisMap.put(0x1f4ec, de.veedapp.emojicon.R.drawable.emoji_1f4ec);
        sEmojisMap.put(0x1f4ed, de.veedapp.emojicon.R.drawable.emoji_1f4ed);
        sEmojisMap.put(0x1f4ee, de.veedapp.emojicon.R.drawable.emoji_1f4ee);
        sEmojisMap.put(0x1f4e6, de.veedapp.emojicon.R.drawable.emoji_1f4e6);
        sEmojisMap.put(0x1f4dd, de.veedapp.emojicon.R.drawable.emoji_1f4dd);
        sEmojisMap.put(0x1f4c4, de.veedapp.emojicon.R.drawable.emoji_1f4c4);
        sEmojisMap.put(0x1f4c3, de.veedapp.emojicon.R.drawable.emoji_1f4c3);
        sEmojisMap.put(0x1f4d1, de.veedapp.emojicon.R.drawable.emoji_1f4d1);
        sEmojisMap.put(0x1f4ca, de.veedapp.emojicon.R.drawable.emoji_1f4ca);
        sEmojisMap.put(0x1f4c8, de.veedapp.emojicon.R.drawable.emoji_1f4c8);
        sEmojisMap.put(0x1f4c9, de.veedapp.emojicon.R.drawable.emoji_1f4c9);
        sEmojisMap.put(0x1f4dc, de.veedapp.emojicon.R.drawable.emoji_1f4dc);
        sEmojisMap.put(0x1f4cb, de.veedapp.emojicon.R.drawable.emoji_1f4cb);
        sEmojisMap.put(0x1f4c5, de.veedapp.emojicon.R.drawable.emoji_1f4c5);
        sEmojisMap.put(0x1f4c6, de.veedapp.emojicon.R.drawable.emoji_1f4c6);
        sEmojisMap.put(0x1f4c7, de.veedapp.emojicon.R.drawable.emoji_1f4c7);
        sEmojisMap.put(0x1f4c1, de.veedapp.emojicon.R.drawable.emoji_1f4c1);
        sEmojisMap.put(0x1f4c2, de.veedapp.emojicon.R.drawable.emoji_1f4c2);
        sEmojisMap.put(0x2702, de.veedapp.emojicon.R.drawable.emoji_2702);
        sEmojisMap.put(0x1f4cc, de.veedapp.emojicon.R.drawable.emoji_1f4cc);
        sEmojisMap.put(0x1f4ce, de.veedapp.emojicon.R.drawable.emoji_1f4ce);
        sEmojisMap.put(0x2712, de.veedapp.emojicon.R.drawable.emoji_2712);
        sEmojisMap.put(0x270f, de.veedapp.emojicon.R.drawable.emoji_270f);
        sEmojisMap.put(0x1f4cf, de.veedapp.emojicon.R.drawable.emoji_1f4cf);
        sEmojisMap.put(0x1f4d0, de.veedapp.emojicon.R.drawable.emoji_1f4d0);
        sEmojisMap.put(0x1f4d5, de.veedapp.emojicon.R.drawable.emoji_1f4d5);
        sEmojisMap.put(0x1f4d7, de.veedapp.emojicon.R.drawable.emoji_1f4d7);
        sEmojisMap.put(0x1f4d8, de.veedapp.emojicon.R.drawable.emoji_1f4d8);
        sEmojisMap.put(0x1f4d9, de.veedapp.emojicon.R.drawable.emoji_1f4d9);
        sEmojisMap.put(0x1f4d3, de.veedapp.emojicon.R.drawable.emoji_1f4d3);
        sEmojisMap.put(0x1f4d4, de.veedapp.emojicon.R.drawable.emoji_1f4d4);
        sEmojisMap.put(0x1f4d2, de.veedapp.emojicon.R.drawable.emoji_1f4d2);
        sEmojisMap.put(0x1f4da, de.veedapp.emojicon.R.drawable.emoji_1f4da);
        sEmojisMap.put(0x1f4d6, de.veedapp.emojicon.R.drawable.emoji_1f4d6);
        sEmojisMap.put(0x1f516, de.veedapp.emojicon.R.drawable.emoji_1f516);
        sEmojisMap.put(0x1f4db, de.veedapp.emojicon.R.drawable.emoji_1f4db);
        sEmojisMap.put(0x1f52c, de.veedapp.emojicon.R.drawable.emoji_1f52c);
        sEmojisMap.put(0x1f52d, de.veedapp.emojicon.R.drawable.emoji_1f52d);
        sEmojisMap.put(0x1f4f0, de.veedapp.emojicon.R.drawable.emoji_1f4f0);
        sEmojisMap.put(0x1f3a8, de.veedapp.emojicon.R.drawable.emoji_1f3a8);
        sEmojisMap.put(0x1f3ac, de.veedapp.emojicon.R.drawable.emoji_1f3ac);
        sEmojisMap.put(0x1f3a4, de.veedapp.emojicon.R.drawable.emoji_1f3a4);
        sEmojisMap.put(0x1f3a7, de.veedapp.emojicon.R.drawable.emoji_1f3a7);
        sEmojisMap.put(0x1f3bc, de.veedapp.emojicon.R.drawable.emoji_1f3bc);
        sEmojisMap.put(0x1f3b5, de.veedapp.emojicon.R.drawable.emoji_1f3b5);
        sEmojisMap.put(0x1f3b6, de.veedapp.emojicon.R.drawable.emoji_1f3b6);
        sEmojisMap.put(0x1f3b9, de.veedapp.emojicon.R.drawable.emoji_1f3b9);
        sEmojisMap.put(0x1f3bb, de.veedapp.emojicon.R.drawable.emoji_1f3bb);
        sEmojisMap.put(0x1f3ba, de.veedapp.emojicon.R.drawable.emoji_1f3ba);
        sEmojisMap.put(0x1f3b7, de.veedapp.emojicon.R.drawable.emoji_1f3b7);
        sEmojisMap.put(0x1f3b8, de.veedapp.emojicon.R.drawable.emoji_1f3b8);
        sEmojisMap.put(0x1f47e, de.veedapp.emojicon.R.drawable.emoji_1f47e);
        sEmojisMap.put(0x1f3ae, de.veedapp.emojicon.R.drawable.emoji_1f3ae);
        sEmojisMap.put(0x1f0cf, de.veedapp.emojicon.R.drawable.emoji_1f0cf);
        sEmojisMap.put(0x1f3b4, de.veedapp.emojicon.R.drawable.emoji_1f3b4);
        sEmojisMap.put(0x1f004, de.veedapp.emojicon.R.drawable.emoji_1f004);
        sEmojisMap.put(0x1f3b2, de.veedapp.emojicon.R.drawable.emoji_1f3b2);
        sEmojisMap.put(0x1f3af, de.veedapp.emojicon.R.drawable.emoji_1f3af);
        sEmojisMap.put(0x1f3c8, de.veedapp.emojicon.R.drawable.emoji_1f3c8);
        sEmojisMap.put(0x1f3c0, de.veedapp.emojicon.R.drawable.emoji_1f3c0);
        sEmojisMap.put(0x26bd, de.veedapp.emojicon.R.drawable.emoji_26bd);
        sEmojisMap.put(0x26be, de.veedapp.emojicon.R.drawable.emoji_26be);
        sEmojisMap.put(0x1f3be, de.veedapp.emojicon.R.drawable.emoji_1f3be);
        sEmojisMap.put(0x1f3b1, de.veedapp.emojicon.R.drawable.emoji_1f3b1);
        sEmojisMap.put(0x1f3c9, de.veedapp.emojicon.R.drawable.emoji_1f3c9);
        sEmojisMap.put(0x1f3b3, de.veedapp.emojicon.R.drawable.emoji_1f3b3);
        sEmojisMap.put(0x26f3, de.veedapp.emojicon.R.drawable.emoji_26f3);
        sEmojisMap.put(0x1f6b5, de.veedapp.emojicon.R.drawable.emoji_1f6b5);
        sEmojisMap.put(0x1f6b4, de.veedapp.emojicon.R.drawable.emoji_1f6b4);
        sEmojisMap.put(0x1f3c1, de.veedapp.emojicon.R.drawable.emoji_1f3c1);
        sEmojisMap.put(0x1f3c7, de.veedapp.emojicon.R.drawable.emoji_1f3c7);
        sEmojisMap.put(0x1f3c6, de.veedapp.emojicon.R.drawable.emoji_1f3c6);
        sEmojisMap.put(0x1f3bf, de.veedapp.emojicon.R.drawable.emoji_1f3bf);
        sEmojisMap.put(0x1f3c2, de.veedapp.emojicon.R.drawable.emoji_1f3c2);
        sEmojisMap.put(0x1f3ca, de.veedapp.emojicon.R.drawable.emoji_1f3ca);
        sEmojisMap.put(0x1f3c4, de.veedapp.emojicon.R.drawable.emoji_1f3c4);
        sEmojisMap.put(0x1f3a3, de.veedapp.emojicon.R.drawable.emoji_1f3a3);
        sEmojisMap.put(0x2615, de.veedapp.emojicon.R.drawable.emoji_2615);
        sEmojisMap.put(0x1f375, de.veedapp.emojicon.R.drawable.emoji_1f375);
        sEmojisMap.put(0x1f376, de.veedapp.emojicon.R.drawable.emoji_1f376);
        sEmojisMap.put(0x1f37c, de.veedapp.emojicon.R.drawable.emoji_1f37c);
        sEmojisMap.put(0x1f37a, de.veedapp.emojicon.R.drawable.emoji_1f37a);
        sEmojisMap.put(0x1f37b, de.veedapp.emojicon.R.drawable.emoji_1f37b);
        sEmojisMap.put(0x1f378, de.veedapp.emojicon.R.drawable.emoji_1f378);
        sEmojisMap.put(0x1f379, de.veedapp.emojicon.R.drawable.emoji_1f379);
        sEmojisMap.put(0x1f377, de.veedapp.emojicon.R.drawable.emoji_1f377);
        sEmojisMap.put(0x1f374, de.veedapp.emojicon.R.drawable.emoji_1f374);
        sEmojisMap.put(0x1f355, de.veedapp.emojicon.R.drawable.emoji_1f355);
        sEmojisMap.put(0x1f354, de.veedapp.emojicon.R.drawable.emoji_1f354);
        sEmojisMap.put(0x1f35f, de.veedapp.emojicon.R.drawable.emoji_1f35f);
        sEmojisMap.put(0x1f357, de.veedapp.emojicon.R.drawable.emoji_1f357);
        sEmojisMap.put(0x1f356, de.veedapp.emojicon.R.drawable.emoji_1f356);
        sEmojisMap.put(0x1f35d, de.veedapp.emojicon.R.drawable.emoji_1f35d);
        sEmojisMap.put(0x1f35b, de.veedapp.emojicon.R.drawable.emoji_1f35b);
        sEmojisMap.put(0x1f364, de.veedapp.emojicon.R.drawable.emoji_1f364);
        sEmojisMap.put(0x1f371, de.veedapp.emojicon.R.drawable.emoji_1f371);
        sEmojisMap.put(0x1f363, de.veedapp.emojicon.R.drawable.emoji_1f363);
        sEmojisMap.put(0x1f365, de.veedapp.emojicon.R.drawable.emoji_1f365);
        sEmojisMap.put(0x1f359, de.veedapp.emojicon.R.drawable.emoji_1f359);
        sEmojisMap.put(0x1f358, de.veedapp.emojicon.R.drawable.emoji_1f358);
        sEmojisMap.put(0x1f35a, de.veedapp.emojicon.R.drawable.emoji_1f35a);
        sEmojisMap.put(0x1f35c, de.veedapp.emojicon.R.drawable.emoji_1f35c);
        sEmojisMap.put(0x1f372, de.veedapp.emojicon.R.drawable.emoji_1f372);
        sEmojisMap.put(0x1f362, de.veedapp.emojicon.R.drawable.emoji_1f362);
        sEmojisMap.put(0x1f361, de.veedapp.emojicon.R.drawable.emoji_1f361);
        sEmojisMap.put(0x1f373, de.veedapp.emojicon.R.drawable.emoji_1f373);
        sEmojisMap.put(0x1f35e, de.veedapp.emojicon.R.drawable.emoji_1f35e);
        sEmojisMap.put(0x1f369, de.veedapp.emojicon.R.drawable.emoji_1f369);
        sEmojisMap.put(0x1f36e, de.veedapp.emojicon.R.drawable.emoji_1f36e);
        sEmojisMap.put(0x1f366, de.veedapp.emojicon.R.drawable.emoji_1f366);
        sEmojisMap.put(0x1f368, de.veedapp.emojicon.R.drawable.emoji_1f368);
        sEmojisMap.put(0x1f367, de.veedapp.emojicon.R.drawable.emoji_1f367);
        sEmojisMap.put(0x1f382, de.veedapp.emojicon.R.drawable.emoji_1f382);
        sEmojisMap.put(0x1f370, de.veedapp.emojicon.R.drawable.emoji_1f370);
        sEmojisMap.put(0x1f36a, de.veedapp.emojicon.R.drawable.emoji_1f36a);
        sEmojisMap.put(0x1f36b, de.veedapp.emojicon.R.drawable.emoji_1f36b);
        sEmojisMap.put(0x1f36c, de.veedapp.emojicon.R.drawable.emoji_1f36c);
        sEmojisMap.put(0x1f36d, de.veedapp.emojicon.R.drawable.emoji_1f36d);
        sEmojisMap.put(0x1f36f, de.veedapp.emojicon.R.drawable.emoji_1f36f);
        sEmojisMap.put(0x1f34e, de.veedapp.emojicon.R.drawable.emoji_1f34e);
        sEmojisMap.put(0x1f34f, de.veedapp.emojicon.R.drawable.emoji_1f34f);
        sEmojisMap.put(0x1f34a, de.veedapp.emojicon.R.drawable.emoji_1f34a);
        sEmojisMap.put(0x1f34b, de.veedapp.emojicon.R.drawable.emoji_1f34b);
        sEmojisMap.put(0x1f352, de.veedapp.emojicon.R.drawable.emoji_1f352);
        sEmojisMap.put(0x1f347, de.veedapp.emojicon.R.drawable.emoji_1f347);
        sEmojisMap.put(0x1f349, de.veedapp.emojicon.R.drawable.emoji_1f349);
        sEmojisMap.put(0x1f353, de.veedapp.emojicon.R.drawable.emoji_1f353);
        sEmojisMap.put(0x1f351, de.veedapp.emojicon.R.drawable.emoji_1f351);
        sEmojisMap.put(0x1f348, de.veedapp.emojicon.R.drawable.emoji_1f348);
        sEmojisMap.put(0x1f34c, de.veedapp.emojicon.R.drawable.emoji_1f34c);
        sEmojisMap.put(0x1f350, de.veedapp.emojicon.R.drawable.emoji_1f350);
        sEmojisMap.put(0x1f34d, de.veedapp.emojicon.R.drawable.emoji_1f34d);
        sEmojisMap.put(0x1f360, de.veedapp.emojicon.R.drawable.emoji_1f360);
        sEmojisMap.put(0x1f346, de.veedapp.emojicon.R.drawable.emoji_1f346);
        sEmojisMap.put(0x1f345, de.veedapp.emojicon.R.drawable.emoji_1f345);
        sEmojisMap.put(0x1f33d, de.veedapp.emojicon.R.drawable.emoji_1f33d);

        // Places
        sEmojisMap.put(0x1f3e0, de.veedapp.emojicon.R.drawable.emoji_1f3e0);
        sEmojisMap.put(0x1f3e1, de.veedapp.emojicon.R.drawable.emoji_1f3e1);
        sEmojisMap.put(0x1f3eb, de.veedapp.emojicon.R.drawable.emoji_1f3eb);
        sEmojisMap.put(0x1f3e2, de.veedapp.emojicon.R.drawable.emoji_1f3e2);
        sEmojisMap.put(0x1f3e3, de.veedapp.emojicon.R.drawable.emoji_1f3e3);
        sEmojisMap.put(0x1f3e5, de.veedapp.emojicon.R.drawable.emoji_1f3e5);
        sEmojisMap.put(0x1f3e6, de.veedapp.emojicon.R.drawable.emoji_1f3e6);
        sEmojisMap.put(0x1f3ea, de.veedapp.emojicon.R.drawable.emoji_1f3ea);
        sEmojisMap.put(0x1f3e9, de.veedapp.emojicon.R.drawable.emoji_1f3e9);
        sEmojisMap.put(0x1f3e8, de.veedapp.emojicon.R.drawable.emoji_1f3e8);
        sEmojisMap.put(0x1f492, de.veedapp.emojicon.R.drawable.emoji_1f492);
        sEmojisMap.put(0x26ea, de.veedapp.emojicon.R.drawable.emoji_26ea);
        sEmojisMap.put(0x1f3ec, de.veedapp.emojicon.R.drawable.emoji_1f3ec);
        sEmojisMap.put(0x1f3e4, de.veedapp.emojicon.R.drawable.emoji_1f3e4);
        sEmojisMap.put(0x1f307, de.veedapp.emojicon.R.drawable.emoji_1f307);
        sEmojisMap.put(0x1f306, de.veedapp.emojicon.R.drawable.emoji_1f306);
        sEmojisMap.put(0x1f3ef, de.veedapp.emojicon.R.drawable.emoji_1f3ef);
        sEmojisMap.put(0x1f3f0, de.veedapp.emojicon.R.drawable.emoji_1f3f0);
        sEmojisMap.put(0x26fa, de.veedapp.emojicon.R.drawable.emoji_26fa);
        sEmojisMap.put(0x1f3ed, de.veedapp.emojicon.R.drawable.emoji_1f3ed);
        sEmojisMap.put(0x1f5fc, de.veedapp.emojicon.R.drawable.emoji_1f5fc);
        sEmojisMap.put(0x1f5fe, de.veedapp.emojicon.R.drawable.emoji_1f5fe);
        sEmojisMap.put(0x1f5fb, de.veedapp.emojicon.R.drawable.emoji_1f5fb);
        sEmojisMap.put(0x1f304, de.veedapp.emojicon.R.drawable.emoji_1f304);
        sEmojisMap.put(0x1f305, de.veedapp.emojicon.R.drawable.emoji_1f305);
        sEmojisMap.put(0x1f303, de.veedapp.emojicon.R.drawable.emoji_1f303);
        sEmojisMap.put(0x1f5fd, de.veedapp.emojicon.R.drawable.emoji_1f5fd);
        sEmojisMap.put(0x1f309, de.veedapp.emojicon.R.drawable.emoji_1f309);
        sEmojisMap.put(0x1f3a0, de.veedapp.emojicon.R.drawable.emoji_1f3a0);
        sEmojisMap.put(0x1f3a1, de.veedapp.emojicon.R.drawable.emoji_1f3a1);
        sEmojisMap.put(0x26f2, de.veedapp.emojicon.R.drawable.emoji_26f2);
        sEmojisMap.put(0x1f3a2, de.veedapp.emojicon.R.drawable.emoji_1f3a2);
        sEmojisMap.put(0x1f6a2, de.veedapp.emojicon.R.drawable.emoji_1f6a2);
        sEmojisMap.put(0x26f5, de.veedapp.emojicon.R.drawable.emoji_26f5);
        sEmojisMap.put(0x1f6a4, de.veedapp.emojicon.R.drawable.emoji_1f6a4);
        sEmojisMap.put(0x1f6a3, de.veedapp.emojicon.R.drawable.emoji_1f6a3);
        sEmojisMap.put(0x2693, de.veedapp.emojicon.R.drawable.emoji_2693);
        sEmojisMap.put(0x1f680, de.veedapp.emojicon.R.drawable.emoji_1f680);
        sEmojisMap.put(0x2708, de.veedapp.emojicon.R.drawable.emoji_2708);
        sEmojisMap.put(0x1f4ba, de.veedapp.emojicon.R.drawable.emoji_1f4ba);
        sEmojisMap.put(0x1f681, de.veedapp.emojicon.R.drawable.emoji_1f681);
        sEmojisMap.put(0x1f682, de.veedapp.emojicon.R.drawable.emoji_1f682);
        sEmojisMap.put(0x1f68a, de.veedapp.emojicon.R.drawable.emoji_1f68a);
        sEmojisMap.put(0x1f689, de.veedapp.emojicon.R.drawable.emoji_1f689);
        sEmojisMap.put(0x1f69e, de.veedapp.emojicon.R.drawable.emoji_1f69e);
        sEmojisMap.put(0x1f686, de.veedapp.emojicon.R.drawable.emoji_1f686);
        sEmojisMap.put(0x1f684, de.veedapp.emojicon.R.drawable.emoji_1f684);
        sEmojisMap.put(0x1f685, de.veedapp.emojicon.R.drawable.emoji_1f685);
        sEmojisMap.put(0x1f688, de.veedapp.emojicon.R.drawable.emoji_1f688);
        sEmojisMap.put(0x1f687, de.veedapp.emojicon.R.drawable.emoji_1f687);
        sEmojisMap.put(0x1f69d, de.veedapp.emojicon.R.drawable.emoji_1f69d);
        sEmojisMap.put(0x1f68b, de.veedapp.emojicon.R.drawable.emoji_1f68b); // TODO (rockerhieu) review this emoji
        sEmojisMap.put(0x1f683, de.veedapp.emojicon.R.drawable.emoji_1f683);
        sEmojisMap.put(0x1f68e, de.veedapp.emojicon.R.drawable.emoji_1f68e);
        sEmojisMap.put(0x1f68c, de.veedapp.emojicon.R.drawable.emoji_1f68c);
        sEmojisMap.put(0x1f68d, de.veedapp.emojicon.R.drawable.emoji_1f68d);
        sEmojisMap.put(0x1f699, de.veedapp.emojicon.R.drawable.emoji_1f699);
        sEmojisMap.put(0x1f698, de.veedapp.emojicon.R.drawable.emoji_1f698);
        sEmojisMap.put(0x1f697, de.veedapp.emojicon.R.drawable.emoji_1f697);
        sEmojisMap.put(0x1f695, de.veedapp.emojicon.R.drawable.emoji_1f695);
        sEmojisMap.put(0x1f696, de.veedapp.emojicon.R.drawable.emoji_1f696);
        sEmojisMap.put(0x1f69b, de.veedapp.emojicon.R.drawable.emoji_1f69b);
        sEmojisMap.put(0x1f69a, de.veedapp.emojicon.R.drawable.emoji_1f69a);
        sEmojisMap.put(0x1f6a8, de.veedapp.emojicon.R.drawable.emoji_1f6a8);
        sEmojisMap.put(0x1f693, de.veedapp.emojicon.R.drawable.emoji_1f693);
        sEmojisMap.put(0x1f694, de.veedapp.emojicon.R.drawable.emoji_1f694);
        sEmojisMap.put(0x1f692, de.veedapp.emojicon.R.drawable.emoji_1f692);
        sEmojisMap.put(0x1f691, de.veedapp.emojicon.R.drawable.emoji_1f691);
        sEmojisMap.put(0x1f690, de.veedapp.emojicon.R.drawable.emoji_1f690);
        sEmojisMap.put(0x1f6b2, de.veedapp.emojicon.R.drawable.emoji_1f6b2);
        sEmojisMap.put(0x1f6a1, de.veedapp.emojicon.R.drawable.emoji_1f6a1);
        sEmojisMap.put(0x1f69f, de.veedapp.emojicon.R.drawable.emoji_1f69f);
        sEmojisMap.put(0x1f6a0, de.veedapp.emojicon.R.drawable.emoji_1f6a0);
        sEmojisMap.put(0x1f69c, de.veedapp.emojicon.R.drawable.emoji_1f69c);
        sEmojisMap.put(0x1f488, de.veedapp.emojicon.R.drawable.emoji_1f488);
        sEmojisMap.put(0x1f68f, de.veedapp.emojicon.R.drawable.emoji_1f68f);
        sEmojisMap.put(0x1f3ab, de.veedapp.emojicon.R.drawable.emoji_1f3ab);
        sEmojisMap.put(0x1f6a6, de.veedapp.emojicon.R.drawable.emoji_1f6a6);
        sEmojisMap.put(0x1f6a5, de.veedapp.emojicon.R.drawable.emoji_1f6a5);
        sEmojisMap.put(0x26a0, de.veedapp.emojicon.R.drawable.emoji_26a0);
        sEmojisMap.put(0x1f6a7, de.veedapp.emojicon.R.drawable.emoji_1f6a7);
        sEmojisMap.put(0x1f530, de.veedapp.emojicon.R.drawable.emoji_1f530);
        sEmojisMap.put(0x26fd, de.veedapp.emojicon.R.drawable.emoji_26fd);
        sEmojisMap.put(0x1f3ee, de.veedapp.emojicon.R.drawable.emoji_1f3ee);
        sEmojisMap.put(0x1f3b0, de.veedapp.emojicon.R.drawable.emoji_1f3b0);
        sEmojisMap.put(0x2668, de.veedapp.emojicon.R.drawable.emoji_2668);
        sEmojisMap.put(0x1f5ff, de.veedapp.emojicon.R.drawable.emoji_1f5ff);
        sEmojisMap.put(0x1f3aa, de.veedapp.emojicon.R.drawable.emoji_1f3aa);
        sEmojisMap.put(0x1f3ad, de.veedapp.emojicon.R.drawable.emoji_1f3ad);
        sEmojisMap.put(0x1f4cd, de.veedapp.emojicon.R.drawable.emoji_1f4cd);
        sEmojisMap.put(0x1f6a9, de.veedapp.emojicon.R.drawable.emoji_1f6a9);
//        Emoji.fromChars("\ud83c\uddef\ud83c\uddf5");
//        Emoji.fromChars("\ud83c\uddf0\ud83c\uddf7");
//        Emoji.fromChars("\ud83c\udde9\ud83c\uddea");
//        Emoji.fromChars("\ud83c\udde8\ud83c\uddf3");
//        Emoji.fromChars("\ud83c\uddfa\ud83c\uddf8");
//        Emoji.fromChars("\ud83c\uddeb\ud83c\uddf7");
//        Emoji.fromChars("\ud83c\uddea\ud83c\uddf8");
//        Emoji.fromChars("\ud83c\uddee\ud83c\uddf9");
//        Emoji.fromChars("\ud83c\uddf7\ud83c\uddfa");
//        Emoji.fromChars("\ud83c\uddec\ud83c\udde7");

        // Symbols
//        Emoji.fromChars("\u0031\u20e3"),
//        Emoji.fromChars("\u0032\u20e3"),
//        Emoji.fromChars("\u0033\u20e3"),
//        Emoji.fromChars("\u0034\u20e3"),
//        Emoji.fromChars("\u0035\u20e3"),
//        Emoji.fromChars("\u0036\u20e3"),
//        Emoji.fromChars("\u0037\u20e3"),
//        Emoji.fromChars("\u0038\u20e3"),
//        Emoji.fromChars("\u0039\u20e3"),
//        Emoji.fromChars("\u0030\u20e3"),
        sEmojisMap.put(0x1f51f, de.veedapp.emojicon.R.drawable.emoji_1f51f);
        sEmojisMap.put(0x1f522, de.veedapp.emojicon.R.drawable.emoji_1f522);
//        Emoji.fromChars("\u0023\u20e3"),
        sEmojisMap.put(0x1f523, de.veedapp.emojicon.R.drawable.emoji_1f523);
        sEmojisMap.put(0x2b06, de.veedapp.emojicon.R.drawable.emoji_2b06);
        sEmojisMap.put(0x2b07, de.veedapp.emojicon.R.drawable.emoji_2b07);
        sEmojisMap.put(0x2b05, de.veedapp.emojicon.R.drawable.emoji_2b05);
        sEmojisMap.put(0x27a1, de.veedapp.emojicon.R.drawable.emoji_27a1);
        sEmojisMap.put(0x1f520, de.veedapp.emojicon.R.drawable.emoji_1f520);
        sEmojisMap.put(0x1f521, de.veedapp.emojicon.R.drawable.emoji_1f521);
        sEmojisMap.put(0x1f524, de.veedapp.emojicon.R.drawable.emoji_1f524);
        sEmojisMap.put(0x2197, de.veedapp.emojicon.R.drawable.emoji_2197);
        sEmojisMap.put(0x2196, de.veedapp.emojicon.R.drawable.emoji_2196);
        sEmojisMap.put(0x2198, de.veedapp.emojicon.R.drawable.emoji_2198);
        sEmojisMap.put(0x2199, de.veedapp.emojicon.R.drawable.emoji_2199);
        sEmojisMap.put(0x2194, de.veedapp.emojicon.R.drawable.emoji_2194);
        sEmojisMap.put(0x2195, de.veedapp.emojicon.R.drawable.emoji_2195);
        sEmojisMap.put(0x1f504, de.veedapp.emojicon.R.drawable.emoji_1f504);
        sEmojisMap.put(0x25c0, de.veedapp.emojicon.R.drawable.emoji_25c0);
        sEmojisMap.put(0x25b6, de.veedapp.emojicon.R.drawable.emoji_25b6);
        sEmojisMap.put(0x1f53c, de.veedapp.emojicon.R.drawable.emoji_1f53c);
        sEmojisMap.put(0x1f53d, de.veedapp.emojicon.R.drawable.emoji_1f53d);
        sEmojisMap.put(0x21a9, de.veedapp.emojicon.R.drawable.emoji_21a9);
        sEmojisMap.put(0x21aa, de.veedapp.emojicon.R.drawable.emoji_21aa);
        sEmojisMap.put(0x2139, de.veedapp.emojicon.R.drawable.emoji_2139);
        sEmojisMap.put(0x23ea, de.veedapp.emojicon.R.drawable.emoji_23ea);
        sEmojisMap.put(0x23e9, de.veedapp.emojicon.R.drawable.emoji_23e9);
        sEmojisMap.put(0x23eb, de.veedapp.emojicon.R.drawable.emoji_23eb);
        sEmojisMap.put(0x23ec, de.veedapp.emojicon.R.drawable.emoji_23ec);
        sEmojisMap.put(0x2935, de.veedapp.emojicon.R.drawable.emoji_2935);
        sEmojisMap.put(0x2934, de.veedapp.emojicon.R.drawable.emoji_2934);
        sEmojisMap.put(0x1f197, de.veedapp.emojicon.R.drawable.emoji_1f197);
        sEmojisMap.put(0x1f500, de.veedapp.emojicon.R.drawable.emoji_1f500);
        sEmojisMap.put(0x1f501, de.veedapp.emojicon.R.drawable.emoji_1f501);
        sEmojisMap.put(0x1f502, de.veedapp.emojicon.R.drawable.emoji_1f502);
        sEmojisMap.put(0x1f195, de.veedapp.emojicon.R.drawable.emoji_1f195);
        sEmojisMap.put(0x1f199, de.veedapp.emojicon.R.drawable.emoji_1f199);
        sEmojisMap.put(0x1f192, de.veedapp.emojicon.R.drawable.emoji_1f192);
        sEmojisMap.put(0x1f193, de.veedapp.emojicon.R.drawable.emoji_1f193);
        sEmojisMap.put(0x1f196, de.veedapp.emojicon.R.drawable.emoji_1f196);
        sEmojisMap.put(0x1f4f6, de.veedapp.emojicon.R.drawable.emoji_1f4f6);
        sEmojisMap.put(0x1f3a6, de.veedapp.emojicon.R.drawable.emoji_1f3a6);
        sEmojisMap.put(0x1f201, de.veedapp.emojicon.R.drawable.emoji_1f201);
        sEmojisMap.put(0x1f22f, de.veedapp.emojicon.R.drawable.emoji_1f22f);
        sEmojisMap.put(0x1f233, de.veedapp.emojicon.R.drawable.emoji_1f233);
        sEmojisMap.put(0x1f235, de.veedapp.emojicon.R.drawable.emoji_1f235);
        sEmojisMap.put(0x1f234, de.veedapp.emojicon.R.drawable.emoji_1f234);
        sEmojisMap.put(0x1f232, de.veedapp.emojicon.R.drawable.emoji_1f232);
        sEmojisMap.put(0x1f250, de.veedapp.emojicon.R.drawable.emoji_1f250);
        sEmojisMap.put(0x1f239, de.veedapp.emojicon.R.drawable.emoji_1f239);
        sEmojisMap.put(0x1f23a, de.veedapp.emojicon.R.drawable.emoji_1f23a);
        sEmojisMap.put(0x1f236, de.veedapp.emojicon.R.drawable.emoji_1f236);
        sEmojisMap.put(0x1f21a, de.veedapp.emojicon.R.drawable.emoji_1f21a);
        sEmojisMap.put(0x1f6bb, de.veedapp.emojicon.R.drawable.emoji_1f6bb);
        sEmojisMap.put(0x1f6b9, de.veedapp.emojicon.R.drawable.emoji_1f6b9);
        sEmojisMap.put(0x1f6ba, de.veedapp.emojicon.R.drawable.emoji_1f6ba);
        sEmojisMap.put(0x1f6bc, de.veedapp.emojicon.R.drawable.emoji_1f6bc);
        sEmojisMap.put(0x1f6be, de.veedapp.emojicon.R.drawable.emoji_1f6be);
        sEmojisMap.put(0x1f6b0, de.veedapp.emojicon.R.drawable.emoji_1f6b0);
        sEmojisMap.put(0x1f6ae, de.veedapp.emojicon.R.drawable.emoji_1f6ae);
        sEmojisMap.put(0x1f17f, de.veedapp.emojicon.R.drawable.emoji_1f17f);
        sEmojisMap.put(0x267f, de.veedapp.emojicon.R.drawable.emoji_267f);
        sEmojisMap.put(0x1f6ad, de.veedapp.emojicon.R.drawable.emoji_1f6ad);
        sEmojisMap.put(0x1f237, de.veedapp.emojicon.R.drawable.emoji_1f237);
        sEmojisMap.put(0x1f238, de.veedapp.emojicon.R.drawable.emoji_1f238);
        sEmojisMap.put(0x1f202, de.veedapp.emojicon.R.drawable.emoji_1f202);
        sEmojisMap.put(0x24c2, de.veedapp.emojicon.R.drawable.emoji_24c2);
        sEmojisMap.put(0x1f6c2, de.veedapp.emojicon.R.drawable.emoji_1f6c2);
        sEmojisMap.put(0x1f6c4, de.veedapp.emojicon.R.drawable.emoji_1f6c4);
        sEmojisMap.put(0x1f6c5, de.veedapp.emojicon.R.drawable.emoji_1f6c5);
        sEmojisMap.put(0x1f6c3, de.veedapp.emojicon.R.drawable.emoji_1f6c3);
        sEmojisMap.put(0x1f251, de.veedapp.emojicon.R.drawable.emoji_1f251);
        sEmojisMap.put(0x3299, de.veedapp.emojicon.R.drawable.emoji_3299);
        sEmojisMap.put(0x3297, de.veedapp.emojicon.R.drawable.emoji_3297);
        sEmojisMap.put(0x1f191, de.veedapp.emojicon.R.drawable.emoji_1f191);
        sEmojisMap.put(0x1f198, de.veedapp.emojicon.R.drawable.emoji_1f198);
        sEmojisMap.put(0x1f194, de.veedapp.emojicon.R.drawable.emoji_1f194);
        sEmojisMap.put(0x1f6ab, de.veedapp.emojicon.R.drawable.emoji_1f6ab);
        sEmojisMap.put(0x1f51e, de.veedapp.emojicon.R.drawable.emoji_1f51e);
        sEmojisMap.put(0x1f4f5, de.veedapp.emojicon.R.drawable.emoji_1f4f5);
        sEmojisMap.put(0x1f6af, de.veedapp.emojicon.R.drawable.emoji_1f6af);
        sEmojisMap.put(0x1f6b1, de.veedapp.emojicon.R.drawable.emoji_1f6b1);
        sEmojisMap.put(0x1f6b3, de.veedapp.emojicon.R.drawable.emoji_1f6b3);
        sEmojisMap.put(0x1f6b7, de.veedapp.emojicon.R.drawable.emoji_1f6b7);
        sEmojisMap.put(0x1f6b8, de.veedapp.emojicon.R.drawable.emoji_1f6b8);
        sEmojisMap.put(0x26d4, de.veedapp.emojicon.R.drawable.emoji_26d4);
        sEmojisMap.put(0x2733, de.veedapp.emojicon.R.drawable.emoji_2733);
        sEmojisMap.put(0x2747, de.veedapp.emojicon.R.drawable.emoji_2747);
        sEmojisMap.put(0x274e, de.veedapp.emojicon.R.drawable.emoji_274e);
        sEmojisMap.put(0x2705, de.veedapp.emojicon.R.drawable.emoji_2705);
        sEmojisMap.put(0x2734, de.veedapp.emojicon.R.drawable.emoji_2734);
        sEmojisMap.put(0x1f49f, de.veedapp.emojicon.R.drawable.emoji_1f49f);
        sEmojisMap.put(0x1f19a, de.veedapp.emojicon.R.drawable.emoji_1f19a);
        sEmojisMap.put(0x1f4f3, de.veedapp.emojicon.R.drawable.emoji_1f4f3);
        sEmojisMap.put(0x1f4f4, de.veedapp.emojicon.R.drawable.emoji_1f4f4);
        sEmojisMap.put(0x1f170, de.veedapp.emojicon.R.drawable.emoji_1f170);
        sEmojisMap.put(0x1f171, de.veedapp.emojicon.R.drawable.emoji_1f171);
        sEmojisMap.put(0x1f18e, de.veedapp.emojicon.R.drawable.emoji_1f18e);
        sEmojisMap.put(0x1f17e, de.veedapp.emojicon.R.drawable.emoji_1f17e);
        sEmojisMap.put(0x1f4a0, de.veedapp.emojicon.R.drawable.emoji_1f4a0);
        sEmojisMap.put(0x27bf, de.veedapp.emojicon.R.drawable.emoji_27bf);
        sEmojisMap.put(0x267b, de.veedapp.emojicon.R.drawable.emoji_267b);
        sEmojisMap.put(0x2648, de.veedapp.emojicon.R.drawable.emoji_2648);
        sEmojisMap.put(0x2649, de.veedapp.emojicon.R.drawable.emoji_2649);
        sEmojisMap.put(0x264a, de.veedapp.emojicon.R.drawable.emoji_264a);
        sEmojisMap.put(0x264b, de.veedapp.emojicon.R.drawable.emoji_264b);
        sEmojisMap.put(0x264c, de.veedapp.emojicon.R.drawable.emoji_264c);
        sEmojisMap.put(0x264d, de.veedapp.emojicon.R.drawable.emoji_264d);
        sEmojisMap.put(0x264e, de.veedapp.emojicon.R.drawable.emoji_264e);
        sEmojisMap.put(0x264f, de.veedapp.emojicon.R.drawable.emoji_264f);
        sEmojisMap.put(0x2650, de.veedapp.emojicon.R.drawable.emoji_2650);
        sEmojisMap.put(0x2651, de.veedapp.emojicon.R.drawable.emoji_2651);
        sEmojisMap.put(0x2652, de.veedapp.emojicon.R.drawable.emoji_2652);
        sEmojisMap.put(0x2653, de.veedapp.emojicon.R.drawable.emoji_2653);
        sEmojisMap.put(0x26ce, de.veedapp.emojicon.R.drawable.emoji_26ce);
        sEmojisMap.put(0x1f52f, de.veedapp.emojicon.R.drawable.emoji_1f52f);
        sEmojisMap.put(0x1f3e7, de.veedapp.emojicon.R.drawable.emoji_1f3e7);
        sEmojisMap.put(0x1f4b9, de.veedapp.emojicon.R.drawable.emoji_1f4b9);
        sEmojisMap.put(0x1f4b2, de.veedapp.emojicon.R.drawable.emoji_1f4b2);
        sEmojisMap.put(0x1f4b1, de.veedapp.emojicon.R.drawable.emoji_1f4b1);
        sEmojisMap.put(0x00a9, de.veedapp.emojicon.R.drawable.emoji_00a9);
        sEmojisMap.put(0x00ae, de.veedapp.emojicon.R.drawable.emoji_00ae);
        sEmojisMap.put(0x2122, de.veedapp.emojicon.R.drawable.emoji_2122);
        sEmojisMap.put(0x274c, de.veedapp.emojicon.R.drawable.emoji_274c);
        sEmojisMap.put(0x203c, de.veedapp.emojicon.R.drawable.emoji_203c);
        sEmojisMap.put(0x2049, de.veedapp.emojicon.R.drawable.emoji_2049);
        sEmojisMap.put(0x2757, de.veedapp.emojicon.R.drawable.emoji_2757);
        sEmojisMap.put(0x2753, de.veedapp.emojicon.R.drawable.emoji_2753);
        sEmojisMap.put(0x2755, de.veedapp.emojicon.R.drawable.emoji_2755);
        sEmojisMap.put(0x2754, de.veedapp.emojicon.R.drawable.emoji_2754);
        sEmojisMap.put(0x2b55, de.veedapp.emojicon.R.drawable.emoji_2b55);
        sEmojisMap.put(0x1f51d, de.veedapp.emojicon.R.drawable.emoji_1f51d);
        sEmojisMap.put(0x1f51a, de.veedapp.emojicon.R.drawable.emoji_1f51a);
        sEmojisMap.put(0x1f519, de.veedapp.emojicon.R.drawable.emoji_1f519);
        sEmojisMap.put(0x1f51b, de.veedapp.emojicon.R.drawable.emoji_1f51b);
        sEmojisMap.put(0x1f51c, de.veedapp.emojicon.R.drawable.emoji_1f51c);
        sEmojisMap.put(0x1f503, de.veedapp.emojicon.R.drawable.emoji_1f503);
        sEmojisMap.put(0x1f55b, de.veedapp.emojicon.R.drawable.emoji_1f55b);
        sEmojisMap.put(0x1f567, de.veedapp.emojicon.R.drawable.emoji_1f567);
        sEmojisMap.put(0x1f550, de.veedapp.emojicon.R.drawable.emoji_1f550);
        sEmojisMap.put(0x1f55c, de.veedapp.emojicon.R.drawable.emoji_1f55c);
        sEmojisMap.put(0x1f551, de.veedapp.emojicon.R.drawable.emoji_1f551);
        sEmojisMap.put(0x1f55d, de.veedapp.emojicon.R.drawable.emoji_1f55d);
        sEmojisMap.put(0x1f552, de.veedapp.emojicon.R.drawable.emoji_1f552);
        sEmojisMap.put(0x1f55e, de.veedapp.emojicon.R.drawable.emoji_1f55e);
        sEmojisMap.put(0x1f553, de.veedapp.emojicon.R.drawable.emoji_1f553);
        sEmojisMap.put(0x1f55f, de.veedapp.emojicon.R.drawable.emoji_1f55f);
        sEmojisMap.put(0x1f554, de.veedapp.emojicon.R.drawable.emoji_1f554);
        sEmojisMap.put(0x1f560, de.veedapp.emojicon.R.drawable.emoji_1f560);
        sEmojisMap.put(0x1f555, de.veedapp.emojicon.R.drawable.emoji_1f555);
        sEmojisMap.put(0x1f556, de.veedapp.emojicon.R.drawable.emoji_1f556);
        sEmojisMap.put(0x1f557, de.veedapp.emojicon.R.drawable.emoji_1f557);
        sEmojisMap.put(0x1f558, de.veedapp.emojicon.R.drawable.emoji_1f558);
        sEmojisMap.put(0x1f559, de.veedapp.emojicon.R.drawable.emoji_1f559);
        sEmojisMap.put(0x1f55a, de.veedapp.emojicon.R.drawable.emoji_1f55a);
        sEmojisMap.put(0x1f561, de.veedapp.emojicon.R.drawable.emoji_1f561);
        sEmojisMap.put(0x1f562, de.veedapp.emojicon.R.drawable.emoji_1f562);
        sEmojisMap.put(0x1f563, de.veedapp.emojicon.R.drawable.emoji_1f563);
        sEmojisMap.put(0x1f564, de.veedapp.emojicon.R.drawable.emoji_1f564);
        sEmojisMap.put(0x1f565, de.veedapp.emojicon.R.drawable.emoji_1f565);
        sEmojisMap.put(0x1f566, de.veedapp.emojicon.R.drawable.emoji_1f566);
        sEmojisMap.put(0x2716, de.veedapp.emojicon.R.drawable.emoji_2716);
        sEmojisMap.put(0x2795, de.veedapp.emojicon.R.drawable.emoji_2795);
        sEmojisMap.put(0x2796, de.veedapp.emojicon.R.drawable.emoji_2796);
        sEmojisMap.put(0x2797, de.veedapp.emojicon.R.drawable.emoji_2797);
        sEmojisMap.put(0x2660, de.veedapp.emojicon.R.drawable.emoji_2660);
        sEmojisMap.put(0x2665, de.veedapp.emojicon.R.drawable.emoji_2665);
        sEmojisMap.put(0x2663, de.veedapp.emojicon.R.drawable.emoji_2663);
        sEmojisMap.put(0x2666, de.veedapp.emojicon.R.drawable.emoji_2666);
        sEmojisMap.put(0x1f4ae, de.veedapp.emojicon.R.drawable.emoji_1f4ae);
        sEmojisMap.put(0x1f4af, de.veedapp.emojicon.R.drawable.emoji_1f4af);
        sEmojisMap.put(0x2714, de.veedapp.emojicon.R.drawable.emoji_2714);
        sEmojisMap.put(0x2611, de.veedapp.emojicon.R.drawable.emoji_2611);
        sEmojisMap.put(0x1f518, de.veedapp.emojicon.R.drawable.emoji_1f518);
        sEmojisMap.put(0x1f517, de.veedapp.emojicon.R.drawable.emoji_1f517);
        sEmojisMap.put(0x27b0, de.veedapp.emojicon.R.drawable.emoji_27b0);
        sEmojisMap.put(0x3030, de.veedapp.emojicon.R.drawable.emoji_3030);
        sEmojisMap.put(0x303d, de.veedapp.emojicon.R.drawable.emoji_303d);
        sEmojisMap.put(0x1f531, de.veedapp.emojicon.R.drawable.emoji_1f531);
        sEmojisMap.put(0x25fc, de.veedapp.emojicon.R.drawable.emoji_25fc);
        sEmojisMap.put(0x25fb, de.veedapp.emojicon.R.drawable.emoji_25fb);
        sEmojisMap.put(0x25fe, de.veedapp.emojicon.R.drawable.emoji_25fe);
        sEmojisMap.put(0x25fd, de.veedapp.emojicon.R.drawable.emoji_25fd);
        sEmojisMap.put(0x25aa, de.veedapp.emojicon.R.drawable.emoji_25aa);
        sEmojisMap.put(0x25ab, de.veedapp.emojicon.R.drawable.emoji_25ab);
        sEmojisMap.put(0x1f53a, de.veedapp.emojicon.R.drawable.emoji_1f53a);
        sEmojisMap.put(0x1f532, de.veedapp.emojicon.R.drawable.emoji_1f532);
        sEmojisMap.put(0x1f533, de.veedapp.emojicon.R.drawable.emoji_1f533);
        sEmojisMap.put(0x26ab, de.veedapp.emojicon.R.drawable.emoji_26ab);
        sEmojisMap.put(0x26aa, de.veedapp.emojicon.R.drawable.emoji_26aa);
        sEmojisMap.put(0x1f534, de.veedapp.emojicon.R.drawable.emoji_1f534);
        sEmojisMap.put(0x1f535, de.veedapp.emojicon.R.drawable.emoji_1f535);
        sEmojisMap.put(0x1f53b, de.veedapp.emojicon.R.drawable.emoji_1f53b);
        sEmojisMap.put(0x2b1c, de.veedapp.emojicon.R.drawable.emoji_2b1c);
        sEmojisMap.put(0x2b1b, de.veedapp.emojicon.R.drawable.emoji_2b1b);
        sEmojisMap.put(0x1f536, de.veedapp.emojicon.R.drawable.emoji_1f536);
        sEmojisMap.put(0x1f537, de.veedapp.emojicon.R.drawable.emoji_1f537);
        sEmojisMap.put(0x1f538, de.veedapp.emojicon.R.drawable.emoji_1f538);
        sEmojisMap.put(0x1f539, de.veedapp.emojicon.R.drawable.emoji_1f539);


        sSoftbanksMap.put(0xe001, de.veedapp.emojicon.R.drawable.emoji_1f466);
        sSoftbanksMap.put(0xe002, de.veedapp.emojicon.R.drawable.emoji_1f467);
        sSoftbanksMap.put(0xe003, de.veedapp.emojicon.R.drawable.emoji_1f48b);
        sSoftbanksMap.put(0xe004, de.veedapp.emojicon.R.drawable.emoji_1f468);
        sSoftbanksMap.put(0xe005, de.veedapp.emojicon.R.drawable.emoji_1f469);
        sSoftbanksMap.put(0xe006, de.veedapp.emojicon.R.drawable.emoji_1f455);
        sSoftbanksMap.put(0xe007, de.veedapp.emojicon.R.drawable.emoji_1f45e);
        sSoftbanksMap.put(0xe008, de.veedapp.emojicon.R.drawable.emoji_1f4f7);
        sSoftbanksMap.put(0xe009, de.veedapp.emojicon.R.drawable.emoji_1f4de);
        sSoftbanksMap.put(0xe00a, de.veedapp.emojicon.R.drawable.emoji_1f4f1);
        sSoftbanksMap.put(0xe00b, de.veedapp.emojicon.R.drawable.emoji_1f4e0);
        sSoftbanksMap.put(0xe00c, de.veedapp.emojicon.R.drawable.emoji_1f4bb);
        sSoftbanksMap.put(0xe00d, de.veedapp.emojicon.R.drawable.emoji_1f44a);
        sSoftbanksMap.put(0xe00e, de.veedapp.emojicon.R.drawable.emoji_1f44d);
        sSoftbanksMap.put(0xe00f, de.veedapp.emojicon.R.drawable.emoji_261d);
        sSoftbanksMap.put(0xe010, de.veedapp.emojicon.R.drawable.emoji_270a);
        sSoftbanksMap.put(0xe011, de.veedapp.emojicon.R.drawable.emoji_270c);
        sSoftbanksMap.put(0xe012, de.veedapp.emojicon.R.drawable.emoji_1f64b);
        sSoftbanksMap.put(0xe013, de.veedapp.emojicon.R.drawable.emoji_1f3bf);
        sSoftbanksMap.put(0xe014, de.veedapp.emojicon.R.drawable.emoji_26f3);
        sSoftbanksMap.put(0xe015, de.veedapp.emojicon.R.drawable.emoji_1f3be);
        sSoftbanksMap.put(0xe016, de.veedapp.emojicon.R.drawable.emoji_26be);
        sSoftbanksMap.put(0xe017, de.veedapp.emojicon.R.drawable.emoji_1f3c4);
        sSoftbanksMap.put(0xe018, de.veedapp.emojicon.R.drawable.emoji_26bd);
        sSoftbanksMap.put(0xe019, de.veedapp.emojicon.R.drawable.emoji_1f3a3);
        sSoftbanksMap.put(0xe01a, de.veedapp.emojicon.R.drawable.emoji_1f434);
        sSoftbanksMap.put(0xe01b, de.veedapp.emojicon.R.drawable.emoji_1f697);
        sSoftbanksMap.put(0xe01c, de.veedapp.emojicon.R.drawable.emoji_26f5);
        sSoftbanksMap.put(0xe01d, de.veedapp.emojicon.R.drawable.emoji_2708);
        sSoftbanksMap.put(0xe01e, de.veedapp.emojicon.R.drawable.emoji_1f683);
        sSoftbanksMap.put(0xe01f, de.veedapp.emojicon.R.drawable.emoji_1f685);
        sSoftbanksMap.put(0xe020, de.veedapp.emojicon.R.drawable.emoji_2753);
        sSoftbanksMap.put(0xe021, de.veedapp.emojicon.R.drawable.emoji_2757);
        sSoftbanksMap.put(0xe022, de.veedapp.emojicon.R.drawable.emoji_2764);
        sSoftbanksMap.put(0xe023, de.veedapp.emojicon.R.drawable.emoji_1f494);
        sSoftbanksMap.put(0xe024, de.veedapp.emojicon.R.drawable.emoji_1f550);
        sSoftbanksMap.put(0xe025, de.veedapp.emojicon.R.drawable.emoji_1f551);
        sSoftbanksMap.put(0xe026, de.veedapp.emojicon.R.drawable.emoji_1f552);
        sSoftbanksMap.put(0xe027, de.veedapp.emojicon.R.drawable.emoji_1f553);
        sSoftbanksMap.put(0xe028, de.veedapp.emojicon.R.drawable.emoji_1f554);
        sSoftbanksMap.put(0xe029, de.veedapp.emojicon.R.drawable.emoji_1f555);
        sSoftbanksMap.put(0xe02a, de.veedapp.emojicon.R.drawable.emoji_1f556);
        sSoftbanksMap.put(0xe02b, de.veedapp.emojicon.R.drawable.emoji_1f557);
        sSoftbanksMap.put(0xe02c, de.veedapp.emojicon.R.drawable.emoji_1f558);
        sSoftbanksMap.put(0xe02d, de.veedapp.emojicon.R.drawable.emoji_1f559);
        sSoftbanksMap.put(0xe02e, de.veedapp.emojicon.R.drawable.emoji_1f55a);
        sSoftbanksMap.put(0xe02f, de.veedapp.emojicon.R.drawable.emoji_1f55b);
        sSoftbanksMap.put(0xe030, de.veedapp.emojicon.R.drawable.emoji_1f338);
        sSoftbanksMap.put(0xe031, de.veedapp.emojicon.R.drawable.emoji_1f531);
        sSoftbanksMap.put(0xe032, de.veedapp.emojicon.R.drawable.emoji_1f339);
        sSoftbanksMap.put(0xe033, de.veedapp.emojicon.R.drawable.emoji_1f384);
        sSoftbanksMap.put(0xe034, de.veedapp.emojicon.R.drawable.emoji_1f48d);
        sSoftbanksMap.put(0xe035, de.veedapp.emojicon.R.drawable.emoji_1f48e);
        sSoftbanksMap.put(0xe036, de.veedapp.emojicon.R.drawable.emoji_1f3e0);
        sSoftbanksMap.put(0xe037, de.veedapp.emojicon.R.drawable.emoji_26ea);
        sSoftbanksMap.put(0xe038, de.veedapp.emojicon.R.drawable.emoji_1f3e2);
        sSoftbanksMap.put(0xe039, de.veedapp.emojicon.R.drawable.emoji_1f689);
        sSoftbanksMap.put(0xe03a, de.veedapp.emojicon.R.drawable.emoji_26fd);
        sSoftbanksMap.put(0xe03b, de.veedapp.emojicon.R.drawable.emoji_1f5fb);
        sSoftbanksMap.put(0xe03c, de.veedapp.emojicon.R.drawable.emoji_1f3a4);
        sSoftbanksMap.put(0xe03d, de.veedapp.emojicon.R.drawable.emoji_1f3a5);
        sSoftbanksMap.put(0xe03e, de.veedapp.emojicon.R.drawable.emoji_1f3b5);
        sSoftbanksMap.put(0xe03f, de.veedapp.emojicon.R.drawable.emoji_1f511);
        sSoftbanksMap.put(0xe040, de.veedapp.emojicon.R.drawable.emoji_1f3b7);
        sSoftbanksMap.put(0xe041, de.veedapp.emojicon.R.drawable.emoji_1f3b8);
        sSoftbanksMap.put(0xe042, de.veedapp.emojicon.R.drawable.emoji_1f3ba);
        sSoftbanksMap.put(0xe043, de.veedapp.emojicon.R.drawable.emoji_1f374);
        sSoftbanksMap.put(0xe044, de.veedapp.emojicon.R.drawable.emoji_1f377);
        sSoftbanksMap.put(0xe045, de.veedapp.emojicon.R.drawable.emoji_2615);
        sSoftbanksMap.put(0xe046, de.veedapp.emojicon.R.drawable.emoji_1f370);
        sSoftbanksMap.put(0xe047, de.veedapp.emojicon.R.drawable.emoji_1f37a);
        sSoftbanksMap.put(0xe048, de.veedapp.emojicon.R.drawable.emoji_26c4);
        sSoftbanksMap.put(0xe049, de.veedapp.emojicon.R.drawable.emoji_2601);
        sSoftbanksMap.put(0xe04a, de.veedapp.emojicon.R.drawable.emoji_2600);
        sSoftbanksMap.put(0xe04b, de.veedapp.emojicon.R.drawable.emoji_2614);
        sSoftbanksMap.put(0xe04c, de.veedapp.emojicon.R.drawable.emoji_1f313);
        sSoftbanksMap.put(0xe04d, de.veedapp.emojicon.R.drawable.emoji_1f304);
        sSoftbanksMap.put(0xe04e, de.veedapp.emojicon.R.drawable.emoji_1f47c);
        sSoftbanksMap.put(0xe04f, de.veedapp.emojicon.R.drawable.emoji_1f431);
        sSoftbanksMap.put(0xe050, de.veedapp.emojicon.R.drawable.emoji_1f42f);
        sSoftbanksMap.put(0xe051, de.veedapp.emojicon.R.drawable.emoji_1f43b);
        sSoftbanksMap.put(0xe052, de.veedapp.emojicon.R.drawable.emoji_1f429);
        sSoftbanksMap.put(0xe053, de.veedapp.emojicon.R.drawable.emoji_1f42d);
        sSoftbanksMap.put(0xe054, de.veedapp.emojicon.R.drawable.emoji_1f433);
        sSoftbanksMap.put(0xe055, de.veedapp.emojicon.R.drawable.emoji_1f427);
        sSoftbanksMap.put(0xe056, de.veedapp.emojicon.R.drawable.emoji_1f60a);
        sSoftbanksMap.put(0xe057, de.veedapp.emojicon.R.drawable.emoji_1f603);
        sSoftbanksMap.put(0xe058, de.veedapp.emojicon.R.drawable.emoji_1f61e);
        sSoftbanksMap.put(0xe059, de.veedapp.emojicon.R.drawable.emoji_1f620);
        sSoftbanksMap.put(0xe05a, de.veedapp.emojicon.R.drawable.emoji_1f4a9);
        sSoftbanksMap.put(0xe101, de.veedapp.emojicon.R.drawable.emoji_1f4ea);
        sSoftbanksMap.put(0xe102, de.veedapp.emojicon.R.drawable.emoji_1f4ee);
        sSoftbanksMap.put(0xe103, de.veedapp.emojicon.R.drawable.emoji_1f4e7);
        sSoftbanksMap.put(0xe104, de.veedapp.emojicon.R.drawable.emoji_1f4f2);
        sSoftbanksMap.put(0xe105, de.veedapp.emojicon.R.drawable.emoji_1f61c);
        sSoftbanksMap.put(0xe106, de.veedapp.emojicon.R.drawable.emoji_1f60d);
        sSoftbanksMap.put(0xe107, de.veedapp.emojicon.R.drawable.emoji_1f631);
        sSoftbanksMap.put(0xe108, de.veedapp.emojicon.R.drawable.emoji_1f613);
        sSoftbanksMap.put(0xe109, de.veedapp.emojicon.R.drawable.emoji_1f435);
        sSoftbanksMap.put(0xe10a, de.veedapp.emojicon.R.drawable.emoji_1f419);
        sSoftbanksMap.put(0xe10b, de.veedapp.emojicon.R.drawable.emoji_1f437);
        sSoftbanksMap.put(0xe10c, de.veedapp.emojicon.R.drawable.emoji_1f47d);
        sSoftbanksMap.put(0xe10d, de.veedapp.emojicon.R.drawable.emoji_1f680);
        sSoftbanksMap.put(0xe10e, de.veedapp.emojicon.R.drawable.emoji_1f451);
        sSoftbanksMap.put(0xe10f, de.veedapp.emojicon.R.drawable.emoji_1f4a1);
        sSoftbanksMap.put(0xe110, de.veedapp.emojicon.R.drawable.emoji_1f331);
        sSoftbanksMap.put(0xe111, de.veedapp.emojicon.R.drawable.emoji_1f48f);
        sSoftbanksMap.put(0xe112, de.veedapp.emojicon.R.drawable.emoji_1f381);
        sSoftbanksMap.put(0xe113, de.veedapp.emojicon.R.drawable.emoji_1f52b);
        sSoftbanksMap.put(0xe114, de.veedapp.emojicon.R.drawable.emoji_1f50d);
        sSoftbanksMap.put(0xe115, de.veedapp.emojicon.R.drawable.emoji_1f3c3);
        sSoftbanksMap.put(0xe116, de.veedapp.emojicon.R.drawable.emoji_1f528);
        sSoftbanksMap.put(0xe117, de.veedapp.emojicon.R.drawable.emoji_1f386);
        sSoftbanksMap.put(0xe118, de.veedapp.emojicon.R.drawable.emoji_1f341);
        sSoftbanksMap.put(0xe119, de.veedapp.emojicon.R.drawable.emoji_1f342);
        sSoftbanksMap.put(0xe11a, de.veedapp.emojicon.R.drawable.emoji_1f47f);
        sSoftbanksMap.put(0xe11b, de.veedapp.emojicon.R.drawable.emoji_1f47b);
        sSoftbanksMap.put(0xe11c, de.veedapp.emojicon.R.drawable.emoji_1f480);
        sSoftbanksMap.put(0xe11d, de.veedapp.emojicon.R.drawable.emoji_1f525);
        sSoftbanksMap.put(0xe11e, de.veedapp.emojicon.R.drawable.emoji_1f4bc);
        sSoftbanksMap.put(0xe11f, de.veedapp.emojicon.R.drawable.emoji_1f4ba);
        sSoftbanksMap.put(0xe120, de.veedapp.emojicon.R.drawable.emoji_1f354);
        sSoftbanksMap.put(0xe121, de.veedapp.emojicon.R.drawable.emoji_26f2);
        sSoftbanksMap.put(0xe122, de.veedapp.emojicon.R.drawable.emoji_26fa);
        sSoftbanksMap.put(0xe123, de.veedapp.emojicon.R.drawable.emoji_2668);
        sSoftbanksMap.put(0xe124, de.veedapp.emojicon.R.drawable.emoji_1f3a1);
        sSoftbanksMap.put(0xe125, de.veedapp.emojicon.R.drawable.emoji_1f3ab);
        sSoftbanksMap.put(0xe126, de.veedapp.emojicon.R.drawable.emoji_1f4bf);
        sSoftbanksMap.put(0xe127, de.veedapp.emojicon.R.drawable.emoji_1f4c0);
        sSoftbanksMap.put(0xe128, de.veedapp.emojicon.R.drawable.emoji_1f4fb);
        sSoftbanksMap.put(0xe129, de.veedapp.emojicon.R.drawable.emoji_1f4fc);
        sSoftbanksMap.put(0xe12a, de.veedapp.emojicon.R.drawable.emoji_1f4fa);
        sSoftbanksMap.put(0xe12b, de.veedapp.emojicon.R.drawable.emoji_1f47e);
        sSoftbanksMap.put(0xe12c, de.veedapp.emojicon.R.drawable.emoji_303d);
        sSoftbanksMap.put(0xe12d, de.veedapp.emojicon.R.drawable.emoji_1f004);
        sSoftbanksMap.put(0xe12e, de.veedapp.emojicon.R.drawable.emoji_1f19a);
        sSoftbanksMap.put(0xe12f, de.veedapp.emojicon.R.drawable.emoji_1f4b0);
        sSoftbanksMap.put(0xe130, de.veedapp.emojicon.R.drawable.emoji_1f3af);
        sSoftbanksMap.put(0xe131, de.veedapp.emojicon.R.drawable.emoji_1f3c6);
        sSoftbanksMap.put(0xe132, de.veedapp.emojicon.R.drawable.emoji_1f3c1);
        sSoftbanksMap.put(0xe133, de.veedapp.emojicon.R.drawable.emoji_1f3b0);
        sSoftbanksMap.put(0xe134, de.veedapp.emojicon.R.drawable.emoji_1f40e);
        sSoftbanksMap.put(0xe135, de.veedapp.emojicon.R.drawable.emoji_1f6a4);
        sSoftbanksMap.put(0xe136, de.veedapp.emojicon.R.drawable.emoji_1f6b2);
        sSoftbanksMap.put(0xe137, de.veedapp.emojicon.R.drawable.emoji_1f6a7);
        sSoftbanksMap.put(0xe138, de.veedapp.emojicon.R.drawable.emoji_1f6b9);
        sSoftbanksMap.put(0xe139, de.veedapp.emojicon.R.drawable.emoji_1f6ba);
        sSoftbanksMap.put(0xe13a, de.veedapp.emojicon.R.drawable.emoji_1f6bc);
        sSoftbanksMap.put(0xe13b, de.veedapp.emojicon.R.drawable.emoji_1f489);
        sSoftbanksMap.put(0xe13c, de.veedapp.emojicon.R.drawable.emoji_1f4a4);
        sSoftbanksMap.put(0xe13d, de.veedapp.emojicon.R.drawable.emoji_26a1);
        sSoftbanksMap.put(0xe13e, de.veedapp.emojicon.R.drawable.emoji_1f460);
        sSoftbanksMap.put(0xe13f, de.veedapp.emojicon.R.drawable.emoji_1f6c0);
        sSoftbanksMap.put(0xe140, de.veedapp.emojicon.R.drawable.emoji_1f6bd);
        sSoftbanksMap.put(0xe141, de.veedapp.emojicon.R.drawable.emoji_1f50a);
        sSoftbanksMap.put(0xe142, de.veedapp.emojicon.R.drawable.emoji_1f4e2);
        sSoftbanksMap.put(0xe143, de.veedapp.emojicon.R.drawable.emoji_1f38c);
        sSoftbanksMap.put(0xe144, de.veedapp.emojicon.R.drawable.emoji_1f50f);
        sSoftbanksMap.put(0xe145, de.veedapp.emojicon.R.drawable.emoji_1f513);
        sSoftbanksMap.put(0xe146, de.veedapp.emojicon.R.drawable.emoji_1f306);
        sSoftbanksMap.put(0xe147, de.veedapp.emojicon.R.drawable.emoji_1f373);
        sSoftbanksMap.put(0xe148, de.veedapp.emojicon.R.drawable.emoji_1f4c7);
        sSoftbanksMap.put(0xe149, de.veedapp.emojicon.R.drawable.emoji_1f4b1);
        sSoftbanksMap.put(0xe14a, de.veedapp.emojicon.R.drawable.emoji_1f4b9);
        sSoftbanksMap.put(0xe14b, de.veedapp.emojicon.R.drawable.emoji_1f4e1);
        sSoftbanksMap.put(0xe14c, de.veedapp.emojicon.R.drawable.emoji_1f4aa);
        sSoftbanksMap.put(0xe14d, de.veedapp.emojicon.R.drawable.emoji_1f3e6);
        sSoftbanksMap.put(0xe14e, de.veedapp.emojicon.R.drawable.emoji_1f6a5);
        sSoftbanksMap.put(0xe14f, de.veedapp.emojicon.R.drawable.emoji_1f17f);
        sSoftbanksMap.put(0xe150, de.veedapp.emojicon.R.drawable.emoji_1f68f);
        sSoftbanksMap.put(0xe151, de.veedapp.emojicon.R.drawable.emoji_1f6bb);
        sSoftbanksMap.put(0xe152, de.veedapp.emojicon.R.drawable.emoji_1f46e);
        sSoftbanksMap.put(0xe153, de.veedapp.emojicon.R.drawable.emoji_1f3e3);
        sSoftbanksMap.put(0xe154, de.veedapp.emojicon.R.drawable.emoji_1f3e7);
        sSoftbanksMap.put(0xe155, de.veedapp.emojicon.R.drawable.emoji_1f3e5);
        sSoftbanksMap.put(0xe156, de.veedapp.emojicon.R.drawable.emoji_1f3ea);
        sSoftbanksMap.put(0xe157, de.veedapp.emojicon.R.drawable.emoji_1f3eb);
        sSoftbanksMap.put(0xe158, de.veedapp.emojicon.R.drawable.emoji_1f3e8);
        sSoftbanksMap.put(0xe159, de.veedapp.emojicon.R.drawable.emoji_1f68c);
        sSoftbanksMap.put(0xe15a, de.veedapp.emojicon.R.drawable.emoji_1f695);
        sSoftbanksMap.put(0xe201, de.veedapp.emojicon.R.drawable.emoji_1f6b6);
        sSoftbanksMap.put(0xe202, de.veedapp.emojicon.R.drawable.emoji_1f6a2);
        sSoftbanksMap.put(0xe203, de.veedapp.emojicon.R.drawable.emoji_1f201);
        sSoftbanksMap.put(0xe204, de.veedapp.emojicon.R.drawable.emoji_1f49f);
        sSoftbanksMap.put(0xe205, de.veedapp.emojicon.R.drawable.emoji_2734);
        sSoftbanksMap.put(0xe206, de.veedapp.emojicon.R.drawable.emoji_2733);
        sSoftbanksMap.put(0xe207, de.veedapp.emojicon.R.drawable.emoji_1f51e);
        sSoftbanksMap.put(0xe208, de.veedapp.emojicon.R.drawable.emoji_1f6ad);
        sSoftbanksMap.put(0xe209, de.veedapp.emojicon.R.drawable.emoji_1f530);
        sSoftbanksMap.put(0xe20a, de.veedapp.emojicon.R.drawable.emoji_267f);
        sSoftbanksMap.put(0xe20b, de.veedapp.emojicon.R.drawable.emoji_1f4f6);
        sSoftbanksMap.put(0xe20c, de.veedapp.emojicon.R.drawable.emoji_2665);
        sSoftbanksMap.put(0xe20d, de.veedapp.emojicon.R.drawable.emoji_2666);
        sSoftbanksMap.put(0xe20e, de.veedapp.emojicon.R.drawable.emoji_2660);
        sSoftbanksMap.put(0xe20f, de.veedapp.emojicon.R.drawable.emoji_2663);
        sSoftbanksMap.put(0xe210, de.veedapp.emojicon.R.drawable.emoji_0023);
        sSoftbanksMap.put(0xe211, de.veedapp.emojicon.R.drawable.emoji_27bf);
        sSoftbanksMap.put(0xe212, de.veedapp.emojicon.R.drawable.emoji_1f195);
        sSoftbanksMap.put(0xe213, de.veedapp.emojicon.R.drawable.emoji_1f199);
        sSoftbanksMap.put(0xe214, de.veedapp.emojicon.R.drawable.emoji_1f192);
        sSoftbanksMap.put(0xe215, de.veedapp.emojicon.R.drawable.emoji_1f236);
        sSoftbanksMap.put(0xe216, de.veedapp.emojicon.R.drawable.emoji_1f21a);
        sSoftbanksMap.put(0xe217, de.veedapp.emojicon.R.drawable.emoji_1f237);
        sSoftbanksMap.put(0xe218, de.veedapp.emojicon.R.drawable.emoji_1f238);
        sSoftbanksMap.put(0xe219, de.veedapp.emojicon.R.drawable.emoji_1f534);
        sSoftbanksMap.put(0xe21a, de.veedapp.emojicon.R.drawable.emoji_1f532);
        sSoftbanksMap.put(0xe21b, de.veedapp.emojicon.R.drawable.emoji_1f533);
        sSoftbanksMap.put(0xe21c, de.veedapp.emojicon.R.drawable.emoji_0031);
        sSoftbanksMap.put(0xe21d, de.veedapp.emojicon.R.drawable.emoji_0032);
        sSoftbanksMap.put(0xe21e, de.veedapp.emojicon.R.drawable.emoji_0033);
        sSoftbanksMap.put(0xe21f, de.veedapp.emojicon.R.drawable.emoji_0034);
        sSoftbanksMap.put(0xe220, de.veedapp.emojicon.R.drawable.emoji_0035);
        sSoftbanksMap.put(0xe221, de.veedapp.emojicon.R.drawable.emoji_0036);
        sSoftbanksMap.put(0xe222, de.veedapp.emojicon.R.drawable.emoji_0037);
        sSoftbanksMap.put(0xe223, de.veedapp.emojicon.R.drawable.emoji_0038);
        sSoftbanksMap.put(0xe224, de.veedapp.emojicon.R.drawable.emoji_0039);
        sSoftbanksMap.put(0xe225, de.veedapp.emojicon.R.drawable.emoji_0030);
        sSoftbanksMap.put(0xe226, de.veedapp.emojicon.R.drawable.emoji_1f250);
        sSoftbanksMap.put(0xe227, de.veedapp.emojicon.R.drawable.emoji_1f239);
        sSoftbanksMap.put(0xe228, de.veedapp.emojicon.R.drawable.emoji_1f202);
        sSoftbanksMap.put(0xe229, de.veedapp.emojicon.R.drawable.emoji_1f194);
        sSoftbanksMap.put(0xe22a, de.veedapp.emojicon.R.drawable.emoji_1f235);
        sSoftbanksMap.put(0xe22b, de.veedapp.emojicon.R.drawable.emoji_1f233);
        sSoftbanksMap.put(0xe22c, de.veedapp.emojicon.R.drawable.emoji_1f22f);
        sSoftbanksMap.put(0xe22d, de.veedapp.emojicon.R.drawable.emoji_1f23a);
        sSoftbanksMap.put(0xe22e, de.veedapp.emojicon.R.drawable.emoji_1f446);
        sSoftbanksMap.put(0xe22f, de.veedapp.emojicon.R.drawable.emoji_1f447);
        sSoftbanksMap.put(0xe230, de.veedapp.emojicon.R.drawable.emoji_1f448);
        sSoftbanksMap.put(0xe231, de.veedapp.emojicon.R.drawable.emoji_1f449);
        sSoftbanksMap.put(0xe232, de.veedapp.emojicon.R.drawable.emoji_2b06);
        sSoftbanksMap.put(0xe233, de.veedapp.emojicon.R.drawable.emoji_2b07);
        sSoftbanksMap.put(0xe234, de.veedapp.emojicon.R.drawable.emoji_27a1);
        sSoftbanksMap.put(0xe235, de.veedapp.emojicon.R.drawable.emoji_1f519);
        sSoftbanksMap.put(0xe236, de.veedapp.emojicon.R.drawable.emoji_2197);
        sSoftbanksMap.put(0xe237, de.veedapp.emojicon.R.drawable.emoji_2196);
        sSoftbanksMap.put(0xe238, de.veedapp.emojicon.R.drawable.emoji_2198);
        sSoftbanksMap.put(0xe239, de.veedapp.emojicon.R.drawable.emoji_2199);
        sSoftbanksMap.put(0xe23a, de.veedapp.emojicon.R.drawable.emoji_25b6);
        sSoftbanksMap.put(0xe23b, de.veedapp.emojicon.R.drawable.emoji_25c0);
        sSoftbanksMap.put(0xe23c, de.veedapp.emojicon.R.drawable.emoji_23e9);
        sSoftbanksMap.put(0xe23d, de.veedapp.emojicon.R.drawable.emoji_23ea);
        sSoftbanksMap.put(0xe23e, de.veedapp.emojicon.R.drawable.emoji_1f52e);
        sSoftbanksMap.put(0xe23f, de.veedapp.emojicon.R.drawable.emoji_2648);
        sSoftbanksMap.put(0xe240, de.veedapp.emojicon.R.drawable.emoji_2649);
        sSoftbanksMap.put(0xe241, de.veedapp.emojicon.R.drawable.emoji_264a);
        sSoftbanksMap.put(0xe242, de.veedapp.emojicon.R.drawable.emoji_264b);
        sSoftbanksMap.put(0xe243, de.veedapp.emojicon.R.drawable.emoji_264c);
        sSoftbanksMap.put(0xe244, de.veedapp.emojicon.R.drawable.emoji_264d);
        sSoftbanksMap.put(0xe245, de.veedapp.emojicon.R.drawable.emoji_264e);
        sSoftbanksMap.put(0xe246, de.veedapp.emojicon.R.drawable.emoji_264f);
        sSoftbanksMap.put(0xe247, de.veedapp.emojicon.R.drawable.emoji_2650);
        sSoftbanksMap.put(0xe248, de.veedapp.emojicon.R.drawable.emoji_2651);
        sSoftbanksMap.put(0xe249, de.veedapp.emojicon.R.drawable.emoji_2652);
        sSoftbanksMap.put(0xe24a, de.veedapp.emojicon.R.drawable.emoji_2653);
        sSoftbanksMap.put(0xe24b, de.veedapp.emojicon.R.drawable.emoji_26ce);
        sSoftbanksMap.put(0xe24c, de.veedapp.emojicon.R.drawable.emoji_1f51d);
        sSoftbanksMap.put(0xe24d, de.veedapp.emojicon.R.drawable.emoji_1f197);
        sSoftbanksMap.put(0xe24e, de.veedapp.emojicon.R.drawable.emoji_00a9);
        sSoftbanksMap.put(0xe24f, de.veedapp.emojicon.R.drawable.emoji_00ae);
        sSoftbanksMap.put(0xe250, de.veedapp.emojicon.R.drawable.emoji_1f4f3);
        sSoftbanksMap.put(0xe251, de.veedapp.emojicon.R.drawable.emoji_1f4f4);
        sSoftbanksMap.put(0xe252, de.veedapp.emojicon.R.drawable.emoji_26a0);
        sSoftbanksMap.put(0xe253, de.veedapp.emojicon.R.drawable.emoji_1f481);
        sSoftbanksMap.put(0xe301, de.veedapp.emojicon.R.drawable.emoji_1f4c3);
        sSoftbanksMap.put(0xe302, de.veedapp.emojicon.R.drawable.emoji_1f454);
        sSoftbanksMap.put(0xe303, de.veedapp.emojicon.R.drawable.emoji_1f33a);
        sSoftbanksMap.put(0xe304, de.veedapp.emojicon.R.drawable.emoji_1f337);
        sSoftbanksMap.put(0xe305, de.veedapp.emojicon.R.drawable.emoji_1f33b);
        sSoftbanksMap.put(0xe306, de.veedapp.emojicon.R.drawable.emoji_1f490);
        sSoftbanksMap.put(0xe307, de.veedapp.emojicon.R.drawable.emoji_1f334);
        sSoftbanksMap.put(0xe308, de.veedapp.emojicon.R.drawable.emoji_1f335);
        sSoftbanksMap.put(0xe309, de.veedapp.emojicon.R.drawable.emoji_1f6be);
        sSoftbanksMap.put(0xe30a, de.veedapp.emojicon.R.drawable.emoji_1f3a7);
        sSoftbanksMap.put(0xe30b, de.veedapp.emojicon.R.drawable.emoji_1f376);
        sSoftbanksMap.put(0xe30c, de.veedapp.emojicon.R.drawable.emoji_1f37b);
        sSoftbanksMap.put(0xe30d, de.veedapp.emojicon.R.drawable.emoji_3297);
        sSoftbanksMap.put(0xe30e, de.veedapp.emojicon.R.drawable.emoji_1f6ac);
        sSoftbanksMap.put(0xe30f, de.veedapp.emojicon.R.drawable.emoji_1f48a);
        sSoftbanksMap.put(0xe310, de.veedapp.emojicon.R.drawable.emoji_1f388);
        sSoftbanksMap.put(0xe311, de.veedapp.emojicon.R.drawable.emoji_1f4a3);
        sSoftbanksMap.put(0xe312, de.veedapp.emojicon.R.drawable.emoji_1f389);
        sSoftbanksMap.put(0xe313, de.veedapp.emojicon.R.drawable.emoji_2702);
        sSoftbanksMap.put(0xe314, de.veedapp.emojicon.R.drawable.emoji_1f380);
        sSoftbanksMap.put(0xe315, de.veedapp.emojicon.R.drawable.emoji_3299);
        sSoftbanksMap.put(0xe316, de.veedapp.emojicon.R.drawable.emoji_1f4bd);
        sSoftbanksMap.put(0xe317, de.veedapp.emojicon.R.drawable.emoji_1f4e3);
        sSoftbanksMap.put(0xe318, de.veedapp.emojicon.R.drawable.emoji_1f452);
        sSoftbanksMap.put(0xe319, de.veedapp.emojicon.R.drawable.emoji_1f457);
        sSoftbanksMap.put(0xe31a, de.veedapp.emojicon.R.drawable.emoji_1f461);
        sSoftbanksMap.put(0xe31b, de.veedapp.emojicon.R.drawable.emoji_1f462);
        sSoftbanksMap.put(0xe31c, de.veedapp.emojicon.R.drawable.emoji_1f484);
        sSoftbanksMap.put(0xe31d, de.veedapp.emojicon.R.drawable.emoji_1f485);
        sSoftbanksMap.put(0xe31e, de.veedapp.emojicon.R.drawable.emoji_1f486);
        sSoftbanksMap.put(0xe31f, de.veedapp.emojicon.R.drawable.emoji_1f487);
        sSoftbanksMap.put(0xe320, de.veedapp.emojicon.R.drawable.emoji_1f488);
        sSoftbanksMap.put(0xe321, de.veedapp.emojicon.R.drawable.emoji_1f458);
        sSoftbanksMap.put(0xe322, de.veedapp.emojicon.R.drawable.emoji_1f459);
        sSoftbanksMap.put(0xe323, de.veedapp.emojicon.R.drawable.emoji_1f45c);
        sSoftbanksMap.put(0xe324, de.veedapp.emojicon.R.drawable.emoji_1f3ac);
        sSoftbanksMap.put(0xe325, de.veedapp.emojicon.R.drawable.emoji_1f514);
        sSoftbanksMap.put(0xe326, de.veedapp.emojicon.R.drawable.emoji_1f3b6);
        sSoftbanksMap.put(0xe327, de.veedapp.emojicon.R.drawable.emoji_1f493);
        sSoftbanksMap.put(0xe328, de.veedapp.emojicon.R.drawable.emoji_1f48c);
        sSoftbanksMap.put(0xe329, de.veedapp.emojicon.R.drawable.emoji_1f498);
        sSoftbanksMap.put(0xe32a, de.veedapp.emojicon.R.drawable.emoji_1f499);
        sSoftbanksMap.put(0xe32b, de.veedapp.emojicon.R.drawable.emoji_1f49a);
        sSoftbanksMap.put(0xe32c, de.veedapp.emojicon.R.drawable.emoji_1f49b);
        sSoftbanksMap.put(0xe32d, de.veedapp.emojicon.R.drawable.emoji_1f49c);
        sSoftbanksMap.put(0xe32e, de.veedapp.emojicon.R.drawable.emoji_2728);
        sSoftbanksMap.put(0xe32f, de.veedapp.emojicon.R.drawable.emoji_2b50);
        sSoftbanksMap.put(0xe330, de.veedapp.emojicon.R.drawable.emoji_1f4a8);
        sSoftbanksMap.put(0xe331, de.veedapp.emojicon.R.drawable.emoji_1f4a6);
        sSoftbanksMap.put(0xe332, de.veedapp.emojicon.R.drawable.emoji_2b55);
        sSoftbanksMap.put(0xe333, de.veedapp.emojicon.R.drawable.emoji_2716);
        sSoftbanksMap.put(0xe334, de.veedapp.emojicon.R.drawable.emoji_1f4a2);
        sSoftbanksMap.put(0xe335, de.veedapp.emojicon.R.drawable.emoji_1f31f);
        sSoftbanksMap.put(0xe336, de.veedapp.emojicon.R.drawable.emoji_2754);
        sSoftbanksMap.put(0xe337, de.veedapp.emojicon.R.drawable.emoji_2755);
        sSoftbanksMap.put(0xe338, de.veedapp.emojicon.R.drawable.emoji_1f375);
        sSoftbanksMap.put(0xe339, de.veedapp.emojicon.R.drawable.emoji_1f35e);
        sSoftbanksMap.put(0xe33a, de.veedapp.emojicon.R.drawable.emoji_1f366);
        sSoftbanksMap.put(0xe33b, de.veedapp.emojicon.R.drawable.emoji_1f35f);
        sSoftbanksMap.put(0xe33c, de.veedapp.emojicon.R.drawable.emoji_1f361);
        sSoftbanksMap.put(0xe33d, de.veedapp.emojicon.R.drawable.emoji_1f358);
        sSoftbanksMap.put(0xe33e, de.veedapp.emojicon.R.drawable.emoji_1f35a);
        sSoftbanksMap.put(0xe33f, de.veedapp.emojicon.R.drawable.emoji_1f35d);
        sSoftbanksMap.put(0xe340, de.veedapp.emojicon.R.drawable.emoji_1f35c);
        sSoftbanksMap.put(0xe341, de.veedapp.emojicon.R.drawable.emoji_1f35b);
        sSoftbanksMap.put(0xe342, de.veedapp.emojicon.R.drawable.emoji_1f359);
        sSoftbanksMap.put(0xe343, de.veedapp.emojicon.R.drawable.emoji_1f362);
        sSoftbanksMap.put(0xe344, de.veedapp.emojicon.R.drawable.emoji_1f363);
        sSoftbanksMap.put(0xe345, de.veedapp.emojicon.R.drawable.emoji_1f34e);
        sSoftbanksMap.put(0xe346, de.veedapp.emojicon.R.drawable.emoji_1f34a);
        sSoftbanksMap.put(0xe347, de.veedapp.emojicon.R.drawable.emoji_1f353);
        sSoftbanksMap.put(0xe348, de.veedapp.emojicon.R.drawable.emoji_1f349);
        sSoftbanksMap.put(0xe349, de.veedapp.emojicon.R.drawable.emoji_1f345);
        sSoftbanksMap.put(0xe34a, de.veedapp.emojicon.R.drawable.emoji_1f346);
        sSoftbanksMap.put(0xe34b, de.veedapp.emojicon.R.drawable.emoji_1f382);
        sSoftbanksMap.put(0xe34c, de.veedapp.emojicon.R.drawable.emoji_1f371);
        sSoftbanksMap.put(0xe34d, de.veedapp.emojicon.R.drawable.emoji_1f372);
        sSoftbanksMap.put(0xe401, de.veedapp.emojicon.R.drawable.emoji_1f625);
        sSoftbanksMap.put(0xe402, de.veedapp.emojicon.R.drawable.emoji_1f60f);
        sSoftbanksMap.put(0xe403, de.veedapp.emojicon.R.drawable.emoji_1f614);
        sSoftbanksMap.put(0xe404, de.veedapp.emojicon.R.drawable.emoji_1f601);
        sSoftbanksMap.put(0xe405, de.veedapp.emojicon.R.drawable.emoji_1f609);
        sSoftbanksMap.put(0xe406, de.veedapp.emojicon.R.drawable.emoji_1f623);
        sSoftbanksMap.put(0xe407, de.veedapp.emojicon.R.drawable.emoji_1f616);
        sSoftbanksMap.put(0xe408, de.veedapp.emojicon.R.drawable.emoji_1f62a);
        sSoftbanksMap.put(0xe409, de.veedapp.emojicon.R.drawable.emoji_1f445);
        sSoftbanksMap.put(0xe40a, de.veedapp.emojicon.R.drawable.emoji_1f606);
        sSoftbanksMap.put(0xe40b, de.veedapp.emojicon.R.drawable.emoji_1f628);
        sSoftbanksMap.put(0xe40c, de.veedapp.emojicon.R.drawable.emoji_1f637);
        sSoftbanksMap.put(0xe40d, de.veedapp.emojicon.R.drawable.emoji_1f633);
        sSoftbanksMap.put(0xe40e, de.veedapp.emojicon.R.drawable.emoji_1f612);
        sSoftbanksMap.put(0xe40f, de.veedapp.emojicon.R.drawable.emoji_1f630);
        sSoftbanksMap.put(0xe410, de.veedapp.emojicon.R.drawable.emoji_1f632);
        sSoftbanksMap.put(0xe411, de.veedapp.emojicon.R.drawable.emoji_1f62d);
        sSoftbanksMap.put(0xe412, de.veedapp.emojicon.R.drawable.emoji_1f602);
        sSoftbanksMap.put(0xe413, de.veedapp.emojicon.R.drawable.emoji_1f622);
        sSoftbanksMap.put(0xe414, de.veedapp.emojicon.R.drawable.emoji_263a);
        sSoftbanksMap.put(0xe415, de.veedapp.emojicon.R.drawable.emoji_1f605);
        sSoftbanksMap.put(0xe416, de.veedapp.emojicon.R.drawable.emoji_1f621);
        sSoftbanksMap.put(0xe417, de.veedapp.emojicon.R.drawable.emoji_1f61a);
        sSoftbanksMap.put(0xe418, de.veedapp.emojicon.R.drawable.emoji_1f618);
        sSoftbanksMap.put(0xe419, de.veedapp.emojicon.R.drawable.emoji_1f440);
        sSoftbanksMap.put(0xe41a, de.veedapp.emojicon.R.drawable.emoji_1f443);
        sSoftbanksMap.put(0xe41b, de.veedapp.emojicon.R.drawable.emoji_1f442);
        sSoftbanksMap.put(0xe41c, de.veedapp.emojicon.R.drawable.emoji_1f444);
        sSoftbanksMap.put(0xe41d, de.veedapp.emojicon.R.drawable.emoji_1f64f);
        sSoftbanksMap.put(0xe41e, de.veedapp.emojicon.R.drawable.emoji_1f44b);
        sSoftbanksMap.put(0xe41f, de.veedapp.emojicon.R.drawable.emoji_1f44f);
        sSoftbanksMap.put(0xe420, de.veedapp.emojicon.R.drawable.emoji_1f44c);
        sSoftbanksMap.put(0xe421, de.veedapp.emojicon.R.drawable.emoji_1f44e);
        sSoftbanksMap.put(0xe422, de.veedapp.emojicon.R.drawable.emoji_1f450);
        sSoftbanksMap.put(0xe423, de.veedapp.emojicon.R.drawable.emoji_1f645);
        sSoftbanksMap.put(0xe424, de.veedapp.emojicon.R.drawable.emoji_1f646);
        sSoftbanksMap.put(0xe425, de.veedapp.emojicon.R.drawable.emoji_1f491);
        sSoftbanksMap.put(0xe426, de.veedapp.emojicon.R.drawable.emoji_1f647);
        sSoftbanksMap.put(0xe427, de.veedapp.emojicon.R.drawable.emoji_1f64c);
        sSoftbanksMap.put(0xe428, de.veedapp.emojicon.R.drawable.emoji_1f46b);
        sSoftbanksMap.put(0xe429, de.veedapp.emojicon.R.drawable.emoji_1f46f);
        sSoftbanksMap.put(0xe42a, de.veedapp.emojicon.R.drawable.emoji_1f3c0);
        sSoftbanksMap.put(0xe42b, de.veedapp.emojicon.R.drawable.emoji_1f3c8);
        sSoftbanksMap.put(0xe42c, de.veedapp.emojicon.R.drawable.emoji_1f3b1);
        sSoftbanksMap.put(0xe42d, de.veedapp.emojicon.R.drawable.emoji_1f3ca);
        sSoftbanksMap.put(0xe42e, de.veedapp.emojicon.R.drawable.emoji_1f699);
        sSoftbanksMap.put(0xe42f, de.veedapp.emojicon.R.drawable.emoji_1f69a);
        sSoftbanksMap.put(0xe430, de.veedapp.emojicon.R.drawable.emoji_1f692);
        sSoftbanksMap.put(0xe431, de.veedapp.emojicon.R.drawable.emoji_1f691);
        sSoftbanksMap.put(0xe432, de.veedapp.emojicon.R.drawable.emoji_1f693);
        sSoftbanksMap.put(0xe433, de.veedapp.emojicon.R.drawable.emoji_1f3a2);
        sSoftbanksMap.put(0xe434, de.veedapp.emojicon.R.drawable.emoji_1f687);
        sSoftbanksMap.put(0xe435, de.veedapp.emojicon.R.drawable.emoji_1f684);
        sSoftbanksMap.put(0xe436, de.veedapp.emojicon.R.drawable.emoji_1f38d);
        sSoftbanksMap.put(0xe437, de.veedapp.emojicon.R.drawable.emoji_1f49d);
        sSoftbanksMap.put(0xe438, de.veedapp.emojicon.R.drawable.emoji_1f38e);
        sSoftbanksMap.put(0xe439, de.veedapp.emojicon.R.drawable.emoji_1f393);
        sSoftbanksMap.put(0xe43a, de.veedapp.emojicon.R.drawable.emoji_1f392);
        sSoftbanksMap.put(0xe43b, de.veedapp.emojicon.R.drawable.emoji_1f38f);
        sSoftbanksMap.put(0xe43c, de.veedapp.emojicon.R.drawable.emoji_1f302);
        sSoftbanksMap.put(0xe43d, de.veedapp.emojicon.R.drawable.emoji_1f492);
        sSoftbanksMap.put(0xe43e, de.veedapp.emojicon.R.drawable.emoji_1f30a);
        sSoftbanksMap.put(0xe43f, de.veedapp.emojicon.R.drawable.emoji_1f367);
        sSoftbanksMap.put(0xe440, de.veedapp.emojicon.R.drawable.emoji_1f387);
        sSoftbanksMap.put(0xe441, de.veedapp.emojicon.R.drawable.emoji_1f41a);
        sSoftbanksMap.put(0xe442, de.veedapp.emojicon.R.drawable.emoji_1f390);
        sSoftbanksMap.put(0xe443, de.veedapp.emojicon.R.drawable.emoji_1f300);
        sSoftbanksMap.put(0xe444, de.veedapp.emojicon.R.drawable.emoji_1f33e);
        sSoftbanksMap.put(0xe445, de.veedapp.emojicon.R.drawable.emoji_1f383);
        sSoftbanksMap.put(0xe446, de.veedapp.emojicon.R.drawable.emoji_1f391);
        sSoftbanksMap.put(0xe447, de.veedapp.emojicon.R.drawable.emoji_1f343);
        sSoftbanksMap.put(0xe448, de.veedapp.emojicon.R.drawable.emoji_1f385);
        sSoftbanksMap.put(0xe449, de.veedapp.emojicon.R.drawable.emoji_1f305);
        sSoftbanksMap.put(0xe44a, de.veedapp.emojicon.R.drawable.emoji_1f307);
        sSoftbanksMap.put(0xe44b, de.veedapp.emojicon.R.drawable.emoji_1f303);
        sSoftbanksMap.put(0xe44b, de.veedapp.emojicon.R.drawable.emoji_1f30c);
        sSoftbanksMap.put(0xe44c, de.veedapp.emojicon.R.drawable.emoji_1f308);
        sSoftbanksMap.put(0xe501, de.veedapp.emojicon.R.drawable.emoji_1f3e9);
        sSoftbanksMap.put(0xe502, de.veedapp.emojicon.R.drawable.emoji_1f3a8);
        sSoftbanksMap.put(0xe503, de.veedapp.emojicon.R.drawable.emoji_1f3a9);
        sSoftbanksMap.put(0xe504, de.veedapp.emojicon.R.drawable.emoji_1f3ec);
        sSoftbanksMap.put(0xe505, de.veedapp.emojicon.R.drawable.emoji_1f3ef);
        sSoftbanksMap.put(0xe506, de.veedapp.emojicon.R.drawable.emoji_1f3f0);
        sSoftbanksMap.put(0xe507, de.veedapp.emojicon.R.drawable.emoji_1f3a6);
        sSoftbanksMap.put(0xe508, de.veedapp.emojicon.R.drawable.emoji_1f3ed);
        sSoftbanksMap.put(0xe509, de.veedapp.emojicon.R.drawable.emoji_1f5fc);
        sSoftbanksMap.put(0xe50b, de.veedapp.emojicon.R.drawable.emoji_1f1ef_1f1f5);
        sSoftbanksMap.put(0xe50c, de.veedapp.emojicon.R.drawable.emoji_1f1fa_1f1f8);
        sSoftbanksMap.put(0xe50d, de.veedapp.emojicon.R.drawable.emoji_1f1eb_1f1f7);
        sSoftbanksMap.put(0xe50e, de.veedapp.emojicon.R.drawable.emoji_1f1e9_1f1ea);
        sSoftbanksMap.put(0xe50f, de.veedapp.emojicon.R.drawable.emoji_1f1ee_1f1f9);
        sSoftbanksMap.put(0xe510, de.veedapp.emojicon.R.drawable.emoji_1f1ec_1f1e7);
        sSoftbanksMap.put(0xe511, de.veedapp.emojicon.R.drawable.emoji_1f1ea_1f1f8);
        sSoftbanksMap.put(0xe512, de.veedapp.emojicon.R.drawable.emoji_1f1f7_1f1fa);
        sSoftbanksMap.put(0xe513, de.veedapp.emojicon.R.drawable.emoji_1f1e8_1f1f3);
        sSoftbanksMap.put(0xe514, de.veedapp.emojicon.R.drawable.emoji_1f1f0_1f1f7);
        sSoftbanksMap.put(0xe515, de.veedapp.emojicon.R.drawable.emoji_1f471);
        sSoftbanksMap.put(0xe516, de.veedapp.emojicon.R.drawable.emoji_1f472);
        sSoftbanksMap.put(0xe517, de.veedapp.emojicon.R.drawable.emoji_1f473);
        sSoftbanksMap.put(0xe518, de.veedapp.emojicon.R.drawable.emoji_1f474);
        sSoftbanksMap.put(0xe519, de.veedapp.emojicon.R.drawable.emoji_1f475);
        sSoftbanksMap.put(0xe51a, de.veedapp.emojicon.R.drawable.emoji_1f476);
        sSoftbanksMap.put(0xe51b, de.veedapp.emojicon.R.drawable.emoji_1f477);
        sSoftbanksMap.put(0xe51c, de.veedapp.emojicon.R.drawable.emoji_1f478);
        sSoftbanksMap.put(0xe51d, de.veedapp.emojicon.R.drawable.emoji_1f5fd);
        sSoftbanksMap.put(0xe51e, de.veedapp.emojicon.R.drawable.emoji_1f482);
        sSoftbanksMap.put(0xe51f, de.veedapp.emojicon.R.drawable.emoji_1f483);
        sSoftbanksMap.put(0xe520, de.veedapp.emojicon.R.drawable.emoji_1f42c);
        sSoftbanksMap.put(0xe521, de.veedapp.emojicon.R.drawable.emoji_1f426);
        sSoftbanksMap.put(0xe522, de.veedapp.emojicon.R.drawable.emoji_1f420);
        sSoftbanksMap.put(0xe523, de.veedapp.emojicon.R.drawable.emoji_1f423);
        sSoftbanksMap.put(0xe524, de.veedapp.emojicon.R.drawable.emoji_1f439);
        sSoftbanksMap.put(0xe525, de.veedapp.emojicon.R.drawable.emoji_1f41b);
        sSoftbanksMap.put(0xe526, de.veedapp.emojicon.R.drawable.emoji_1f418);
        sSoftbanksMap.put(0xe527, de.veedapp.emojicon.R.drawable.emoji_1f428);
        sSoftbanksMap.put(0xe528, de.veedapp.emojicon.R.drawable.emoji_1f412);
        sSoftbanksMap.put(0xe529, de.veedapp.emojicon.R.drawable.emoji_1f411);
        sSoftbanksMap.put(0xe52a, de.veedapp.emojicon.R.drawable.emoji_1f43a);
        sSoftbanksMap.put(0xe52b, de.veedapp.emojicon.R.drawable.emoji_1f42e);
        sSoftbanksMap.put(0xe52c, de.veedapp.emojicon.R.drawable.emoji_1f430);
        sSoftbanksMap.put(0xe52d, de.veedapp.emojicon.R.drawable.emoji_1f40d);
        sSoftbanksMap.put(0xe52e, de.veedapp.emojicon.R.drawable.emoji_1f414);
        sSoftbanksMap.put(0xe52f, de.veedapp.emojicon.R.drawable.emoji_1f417);
        sSoftbanksMap.put(0xe530, de.veedapp.emojicon.R.drawable.emoji_1f42b);
        sSoftbanksMap.put(0xe531, de.veedapp.emojicon.R.drawable.emoji_1f438);
        sSoftbanksMap.put(0xe532, de.veedapp.emojicon.R.drawable.emoji_1f170);
        sSoftbanksMap.put(0xe533, de.veedapp.emojicon.R.drawable.emoji_1f171);
        sSoftbanksMap.put(0xe534, de.veedapp.emojicon.R.drawable.emoji_1f18e);
        sSoftbanksMap.put(0xe535, de.veedapp.emojicon.R.drawable.emoji_1f17e);
        sSoftbanksMap.put(0xe536, de.veedapp.emojicon.R.drawable.emoji_1f43e);
        sSoftbanksMap.put(0xe537, de.veedapp.emojicon.R.drawable.emoji_2122);

        sEmojisMap.put(0x1f642, de.veedapp.emojicon.R.drawable.emoji_1f642);
        sEmojisMap.put(0x1f917, de.veedapp.emojicon.R.drawable.emoji_1f917);
        sEmojisMap.put(0x1f914, de.veedapp.emojicon.R.drawable.emoji_1f914);
        sEmojisMap.put(0x1f644, de.veedapp.emojicon.R.drawable.emoji_1f644);
        sEmojisMap.put(0x1f910, de.veedapp.emojicon.R.drawable.emoji_1f910);
        sEmojisMap.put(0x1f913, de.veedapp.emojicon.R.drawable.emoji_1f913);
        sEmojisMap.put(0x2639, de.veedapp.emojicon.R.drawable.emoji_2639);
        sEmojisMap.put(0x1f641, de.veedapp.emojicon.R.drawable.emoji_1f641);
        sEmojisMap.put(0x1f643, de.veedapp.emojicon.R.drawable.emoji_1f643);
        sEmojisMap.put(0x1f912, de.veedapp.emojicon.R.drawable.emoji_1f912);
        sEmojisMap.put(0x1f915, de.veedapp.emojicon.R.drawable.emoji_1f915);
        sEmojisMap.put(0x1f911, de.veedapp.emojicon.R.drawable.emoji_1f911);
        sEmojisMap.put(0x26d1, de.veedapp.emojicon.R.drawable.emoji_26d1);
        sEmojisMap.put(0x1f575, de.veedapp.emojicon.R.drawable.emoji_1f575);
        sEmojisMap.put(0x1f5e3, de.veedapp.emojicon.R.drawable.emoji_1f5e3);
        sEmojisMap.put(0x1f574, de.veedapp.emojicon.R.drawable.emoji_1f574);
        sEmojisMap.put(0x1f595, de.veedapp.emojicon.R.drawable.emoji_1f595);
        sEmojisMap.put(0x1f918, de.veedapp.emojicon.R.drawable.emoji_1f918);
        sEmojisMap.put(0x1f590, de.veedapp.emojicon.R.drawable.emoji_1f590);
        sEmojisMap.put(0x270d, de.veedapp.emojicon.R.drawable.emoji_270d);
        sEmojisMap.put(0x1f441, de.veedapp.emojicon.R.drawable.emoji_1f441);
        sEmojisMap.put(0x2763, de.veedapp.emojicon.R.drawable.emoji_2763);
        sEmojisMap.put(0x1f573, de.veedapp.emojicon.R.drawable.emoji_1f573);
        sEmojisMap.put(0x1f5ef, de.veedapp.emojicon.R.drawable.emoji_1f5ef);
        sEmojisMap.put(0x1f576, de.veedapp.emojicon.R.drawable.emoji_1f576);
        sEmojisMap.put(0x1f6cd, de.veedapp.emojicon.R.drawable.emoji_1f6cd);
        sEmojisMap.put(0x1f4ff, de.veedapp.emojicon.R.drawable.emoji_1f4ff);
        sEmojisMap.put(0x2620, de.veedapp.emojicon.R.drawable.emoji_2620);
        sEmojisMap.put(0x1f916, de.veedapp.emojicon.R.drawable.emoji_1f916);
        sEmojisMap.put(0x1f981, de.veedapp.emojicon.R.drawable.emoji_1f981);
        sEmojisMap.put(0x1f984, de.veedapp.emojicon.R.drawable.emoji_1f984);
        sEmojisMap.put(0x1f43f, de.veedapp.emojicon.R.drawable.emoji_1f43f);
        sEmojisMap.put(0x1f983, de.veedapp.emojicon.R.drawable.emoji_1f983);
        sEmojisMap.put(0x1f54a, de.veedapp.emojicon.R.drawable.emoji_1f54a);
        sEmojisMap.put(0x1f980, de.veedapp.emojicon.R.drawable.emoji_1f980);
        sEmojisMap.put(0x1f577, de.veedapp.emojicon.R.drawable.emoji_1f577);
        sEmojisMap.put(0x1f578, de.veedapp.emojicon.R.drawable.emoji_1f578);
        sEmojisMap.put(0x1f982, de.veedapp.emojicon.R.drawable.emoji_1f982);
        sEmojisMap.put(0x1f3f5, de.veedapp.emojicon.R.drawable.emoji_1f3f5);
        sEmojisMap.put(0x2618, de.veedapp.emojicon.R.drawable.emoji_2618);
        sEmojisMap.put(0x1f336, de.veedapp.emojicon.R.drawable.emoji_1f336);
        sEmojisMap.put(0x1f9c0, de.veedapp.emojicon.R.drawable.emoji_1f9c0);
        sEmojisMap.put(0x1f32d, de.veedapp.emojicon.R.drawable.emoji_1f32d);
        sEmojisMap.put(0x1f32e, de.veedapp.emojicon.R.drawable.emoji_1f32e);
        sEmojisMap.put(0x1f32f, de.veedapp.emojicon.R.drawable.emoji_1f32f);
        sEmojisMap.put(0x1f37f, de.veedapp.emojicon.R.drawable.emoji_1f37f);
        sEmojisMap.put(0x1f37e, de.veedapp.emojicon.R.drawable.emoji_1f37e);
        sEmojisMap.put(0x1f37d, de.veedapp.emojicon.R.drawable.emoji_1f37d);
        sEmojisMap.put(0x1f3fa, de.veedapp.emojicon.R.drawable.emoji_1f3fa);
        sEmojisMap.put(0x1f5fa, de.veedapp.emojicon.R.drawable.emoji_1f5fa);
        sEmojisMap.put(0x1f3d4, de.veedapp.emojicon.R.drawable.emoji_1f3d4);
        sEmojisMap.put(0x26f0, de.veedapp.emojicon.R.drawable.emoji_26f0);
        sEmojisMap.put(0x1f3d5, de.veedapp.emojicon.R.drawable.emoji_1f3d5);
        sEmojisMap.put(0x1f3d6, de.veedapp.emojicon.R.drawable.emoji_1f3d6);
        sEmojisMap.put(0x1f3dc, de.veedapp.emojicon.R.drawable.emoji_1f3dc);
        sEmojisMap.put(0x1f3dd, de.veedapp.emojicon.R.drawable.emoji_1f3dd);
        sEmojisMap.put(0x1f3de, de.veedapp.emojicon.R.drawable.emoji_1f3de);
        sEmojisMap.put(0x1f3df, de.veedapp.emojicon.R.drawable.emoji_1f3df);
        sEmojisMap.put(0x1f3db, de.veedapp.emojicon.R.drawable.emoji_1f3db);
        sEmojisMap.put(0x1f3d7, de.veedapp.emojicon.R.drawable.emoji_1f3d7);
        sEmojisMap.put(0x1f3d8, de.veedapp.emojicon.R.drawable.emoji_1f3d8);
        sEmojisMap.put(0x1f3d9, de.veedapp.emojicon.R.drawable.emoji_1f3d9);
        sEmojisMap.put(0x1f3da, de.veedapp.emojicon.R.drawable.emoji_1f3da);
        sEmojisMap.put(0x1f6d0, de.veedapp.emojicon.R.drawable.emoji_1f6d0);
        sEmojisMap.put(0x1f54b, de.veedapp.emojicon.R.drawable.emoji_1f54b);
        sEmojisMap.put(0x1f54c, de.veedapp.emojicon.R.drawable.emoji_1f54c);
        sEmojisMap.put(0x1f54d, de.veedapp.emojicon.R.drawable.emoji_1f54d);
        sEmojisMap.put(0x1f5bc, de.veedapp.emojicon.R.drawable.emoji_1f5bc);
        sEmojisMap.put(0x1f6e2, de.veedapp.emojicon.R.drawable.emoji_1f6e2);
        sEmojisMap.put(0x1f6e3, de.veedapp.emojicon.R.drawable.emoji_1f6e3);
        sEmojisMap.put(0x1f6e4, de.veedapp.emojicon.R.drawable.emoji_1f6e4);
        sEmojisMap.put(0x1f6f3, de.veedapp.emojicon.R.drawable.emoji_1f6f3);
        sEmojisMap.put(0x26f4, de.veedapp.emojicon.R.drawable.emoji_26f4);
        sEmojisMap.put(0x1f6e5, de.veedapp.emojicon.R.drawable.emoji_1f6e5);
        sEmojisMap.put(0x1f6e9, de.veedapp.emojicon.R.drawable.emoji_1f6e9);
        sEmojisMap.put(0x1f6eb, de.veedapp.emojicon.R.drawable.emoji_1f6eb);
        sEmojisMap.put(0x1f6ec, de.veedapp.emojicon.R.drawable.emoji_1f6ec);
        sEmojisMap.put(0x1f6f0, de.veedapp.emojicon.R.drawable.emoji_1f6f0);
        sEmojisMap.put(0x1f6ce, de.veedapp.emojicon.R.drawable.emoji_1f6ce);
        sEmojisMap.put(0x1f6cc, de.veedapp.emojicon.R.drawable.emoji_1f6cc);
        sEmojisMap.put(0x1f6cf, de.veedapp.emojicon.R.drawable.emoji_1f6cf);
        sEmojisMap.put(0x1f6cb, de.veedapp.emojicon.R.drawable.emoji_1f6cb);
        sEmojisMap.put(0x23f1, de.veedapp.emojicon.R.drawable.emoji_23f1);
        sEmojisMap.put(0x23f2, de.veedapp.emojicon.R.drawable.emoji_23f2);
        sEmojisMap.put(0x1f570, de.veedapp.emojicon.R.drawable.emoji_1f570);
        sEmojisMap.put(0x1f321, de.veedapp.emojicon.R.drawable.emoji_1f321);
        sEmojisMap.put(0x26c8, de.veedapp.emojicon.R.drawable.emoji_26c8);
        sEmojisMap.put(0x1f324, de.veedapp.emojicon.R.drawable.emoji_1f324);
        sEmojisMap.put(0x1f325, de.veedapp.emojicon.R.drawable.emoji_1f325);
        sEmojisMap.put(0x1f326, de.veedapp.emojicon.R.drawable.emoji_1f326);
        sEmojisMap.put(0x1f327, de.veedapp.emojicon.R.drawable.emoji_1f327);
        sEmojisMap.put(0x1f328, de.veedapp.emojicon.R.drawable.emoji_1f328);
        sEmojisMap.put(0x1f329, de.veedapp.emojicon.R.drawable.emoji_1f329);
        sEmojisMap.put(0x1f32a, de.veedapp.emojicon.R.drawable.emoji_1f32a);
        sEmojisMap.put(0x1f32b, de.veedapp.emojicon.R.drawable.emoji_1f32b);
        sEmojisMap.put(0x1f32c, de.veedapp.emojicon.R.drawable.emoji_1f32c);
        sEmojisMap.put(0x2602, de.veedapp.emojicon.R.drawable.emoji_2602);
        sEmojisMap.put(0x26f1, de.veedapp.emojicon.R.drawable.emoji_26f1);
        sEmojisMap.put(0x2603, de.veedapp.emojicon.R.drawable.emoji_2603);
        sEmojisMap.put(0x2604, de.veedapp.emojicon.R.drawable.emoji_2604);
        sEmojisMap.put(0x1f54e, de.veedapp.emojicon.R.drawable.emoji_1f54e);
        sEmojisMap.put(0x1f396, de.veedapp.emojicon.R.drawable.emoji_1f396);
        sEmojisMap.put(0x1f397, de.veedapp.emojicon.R.drawable.emoji_1f397);
        sEmojisMap.put(0x1f39e, de.veedapp.emojicon.R.drawable.emoji_1f39e);
        sEmojisMap.put(0x1f39f, de.veedapp.emojicon.R.drawable.emoji_1f39f);
        sEmojisMap.put(0x1f3f7, de.veedapp.emojicon.R.drawable.emoji_1f3f7);
        sEmojisMap.put(0x1f3cc, de.veedapp.emojicon.R.drawable.emoji_1f3cc);
        sEmojisMap.put(0x26f8, de.veedapp.emojicon.R.drawable.emoji_26f8);
        sEmojisMap.put(0x26f7, de.veedapp.emojicon.R.drawable.emoji_26f7);
        sEmojisMap.put(0x26f9, de.veedapp.emojicon.R.drawable.emoji_26f9);
        sEmojisMap.put(0x1f3cb, de.veedapp.emojicon.R.drawable.emoji_1f3cb);
        sEmojisMap.put(0x1f3ce, de.veedapp.emojicon.R.drawable.emoji_1f3ce);
        sEmojisMap.put(0x1f3cd, de.veedapp.emojicon.R.drawable.emoji_1f3cd);
        sEmojisMap.put(0x1f3c5, de.veedapp.emojicon.R.drawable.emoji_1f3c5);
        sEmojisMap.put(0x1f3cf, de.veedapp.emojicon.R.drawable.emoji_1f3cf);
        sEmojisMap.put(0x1f3d0, de.veedapp.emojicon.R.drawable.emoji_1f3d0);
        sEmojisMap.put(0x1f3d1, de.veedapp.emojicon.R.drawable.emoji_1f3d1);
        sEmojisMap.put(0x1f3d2, de.veedapp.emojicon.R.drawable.emoji_1f3d2);
        sEmojisMap.put(0x1f3d3, de.veedapp.emojicon.R.drawable.emoji_1f3d3);
        sEmojisMap.put(0x1f3f8, de.veedapp.emojicon.R.drawable.emoji_1f3f8);
        sEmojisMap.put(0x1f579, de.veedapp.emojicon.R.drawable.emoji_1f579);
        sEmojisMap.put(0x23ed, de.veedapp.emojicon.R.drawable.emoji_23ed);
        sEmojisMap.put(0x23ef, de.veedapp.emojicon.R.drawable.emoji_23ef);
        sEmojisMap.put(0x23ee, de.veedapp.emojicon.R.drawable.emoji_23ee);
        sEmojisMap.put(0x23f8, de.veedapp.emojicon.R.drawable.emoji_23f8);
        sEmojisMap.put(0x23f9, de.veedapp.emojicon.R.drawable.emoji_23f9);
        sEmojisMap.put(0x23fa, de.veedapp.emojicon.R.drawable.emoji_23fa);
        sEmojisMap.put(0x1f399, de.veedapp.emojicon.R.drawable.emoji_1f399);
        sEmojisMap.put(0x1f39a, de.veedapp.emojicon.R.drawable.emoji_1f39a);
        sEmojisMap.put(0x1f39b, de.veedapp.emojicon.R.drawable.emoji_1f39b);
        sEmojisMap.put(0x1f5a5, de.veedapp.emojicon.R.drawable.emoji_1f5a5);
        sEmojisMap.put(0x1f5a8, de.veedapp.emojicon.R.drawable.emoji_1f5a8);
        sEmojisMap.put(0x2328, de.veedapp.emojicon.R.drawable.emoji_2328);
        sEmojisMap.put(0x1f5b1, de.veedapp.emojicon.R.drawable.emoji_1f5b1);
        sEmojisMap.put(0x1f5b2, de.veedapp.emojicon.R.drawable.emoji_1f5b2);
        sEmojisMap.put(0x1f4fd, de.veedapp.emojicon.R.drawable.emoji_1f4fd);
        sEmojisMap.put(0x1f4f8, de.veedapp.emojicon.R.drawable.emoji_1f4f8);
        sEmojisMap.put(0x1f56f, de.veedapp.emojicon.R.drawable.emoji_1f56f);
        sEmojisMap.put(0x1f5de, de.veedapp.emojicon.R.drawable.emoji_1f5de);
        sEmojisMap.put(0x1f5f3, de.veedapp.emojicon.R.drawable.emoji_1f5f3);
        sEmojisMap.put(0x1f58b, de.veedapp.emojicon.R.drawable.emoji_1f58b);
        sEmojisMap.put(0x1f58a, de.veedapp.emojicon.R.drawable.emoji_1f58a);
        sEmojisMap.put(0x1f58c, de.veedapp.emojicon.R.drawable.emoji_1f58c);
        sEmojisMap.put(0x1f58d, de.veedapp.emojicon.R.drawable.emoji_1f58d);
        sEmojisMap.put(0x1f5c2, de.veedapp.emojicon.R.drawable.emoji_1f5c2);
        sEmojisMap.put(0x1f5d2, de.veedapp.emojicon.R.drawable.emoji_1f5d2);
        sEmojisMap.put(0x1f5d3, de.veedapp.emojicon.R.drawable.emoji_1f5d3);
        sEmojisMap.put(0x1f587, de.veedapp.emojicon.R.drawable.emoji_1f587);
        sEmojisMap.put(0x1f5c3, de.veedapp.emojicon.R.drawable.emoji_1f5c3);
        sEmojisMap.put(0x1f5c4, de.veedapp.emojicon.R.drawable.emoji_1f5c4);
        sEmojisMap.put(0x1f5d1, de.veedapp.emojicon.R.drawable.emoji_1f5d1);
        sEmojisMap.put(0x1f5dd, de.veedapp.emojicon.R.drawable.emoji_1f5dd);
        sEmojisMap.put(0x26cf, de.veedapp.emojicon.R.drawable.emoji_26cf);
        sEmojisMap.put(0x2692, de.veedapp.emojicon.R.drawable.emoji_2692);
        sEmojisMap.put(0x1f6e0, de.veedapp.emojicon.R.drawable.emoji_1f6e0);
        sEmojisMap.put(0x2699, de.veedapp.emojicon.R.drawable.emoji_2699);
        sEmojisMap.put(0x1f5dc, de.veedapp.emojicon.R.drawable.emoji_1f5dc);
        sEmojisMap.put(0x2697, de.veedapp.emojicon.R.drawable.emoji_2697);
        sEmojisMap.put(0x2696, de.veedapp.emojicon.R.drawable.emoji_2696);
        sEmojisMap.put(0x26d3, de.veedapp.emojicon.R.drawable.emoji_26d3);
        sEmojisMap.put(0x1f5e1, de.veedapp.emojicon.R.drawable.emoji_1f5e1);
        sEmojisMap.put(0x2694, de.veedapp.emojicon.R.drawable.emoji_2694);
        sEmojisMap.put(0x1f6e1, de.veedapp.emojicon.R.drawable.emoji_1f6e1);
        sEmojisMap.put(0x1f3f9, de.veedapp.emojicon.R.drawable.emoji_1f3f9);
        sEmojisMap.put(0x26b0, de.veedapp.emojicon.R.drawable.emoji_26b0);
        sEmojisMap.put(0x26b1, de.veedapp.emojicon.R.drawable.emoji_26b1);
        sEmojisMap.put(0x1f3f3, de.veedapp.emojicon.R.drawable.emoji_1f3f3);
        sEmojisMap.put(0x1f3f4, de.veedapp.emojicon.R.drawable.emoji_1f3f4);
        sEmojisMap.put(0x269c, de.veedapp.emojicon.R.drawable.emoji_269c);
        sEmojisMap.put(0x269b, de.veedapp.emojicon.R.drawable.emoji_269b);
        sEmojisMap.put(0x1f549, de.veedapp.emojicon.R.drawable.emoji_1f549);
        sEmojisMap.put(0x2721, de.veedapp.emojicon.R.drawable.emoji_2721);
        sEmojisMap.put(0x2638, de.veedapp.emojicon.R.drawable.emoji_2638);
        sEmojisMap.put(0x262f, de.veedapp.emojicon.R.drawable.emoji_262f);
        sEmojisMap.put(0x271d, de.veedapp.emojicon.R.drawable.emoji_271d);
        sEmojisMap.put(0x2626, de.veedapp.emojicon.R.drawable.emoji_2626);
        sEmojisMap.put(0x26e9, de.veedapp.emojicon.R.drawable.emoji_26e9);
        sEmojisMap.put(0x262a, de.veedapp.emojicon.R.drawable.emoji_262a);
        sEmojisMap.put(0x262e, de.veedapp.emojicon.R.drawable.emoji_262e);
        sEmojisMap.put(0x2622, de.veedapp.emojicon.R.drawable.emoji_2622);
        sEmojisMap.put(0x2623, de.veedapp.emojicon.R.drawable.emoji_2623);
        sEmojisMap.put(0x1f5e8, de.veedapp.emojicon.R.drawable.emoji_1f5e8);
    }

    private static boolean isSoftBankEmoji(char c) {
        return ((c >> 12) == 0xe);
    }

    private static int getEmojiResource(Context context, int codePoint) {
        return sEmojisMap.get(codePoint);
    }

    private static int getSoftbankEmojiResource(char c) {
        return sSoftbanksMap.get(c);
    }

    /**
     * Convert emoji characters of the given Spannable to the according emojicon.
     *
     * @param context
     * @param text
     * @param emojiSize
     * @param emojiAlignment
     * @param textSize
     */
    public static void addEmojis(Context context, Spannable text, int emojiSize, int emojiAlignment, int textSize) {
        addEmojis(context, text, emojiSize, emojiAlignment, textSize, 0, -1, false);
    }

    /**
     * Convert emoji characters of the given Spannable to the according emojicon.
     *
     * @param context
     * @param text
     * @param emojiSize
     * @param emojiAlignment
     * @param textSize
     * @param index
     * @param length
     */
    public static void addEmojis(Context context, Spannable text, int emojiSize, int emojiAlignment, int textSize, int index, int length) {
        addEmojis(context, text, emojiSize, emojiAlignment, textSize, index, length, false);
    }

    /**
     * Convert emoji characters of the given Spannable to the according emojicon.
     *
     * @param context
     * @param text
     * @param emojiSize
     * @param emojiAlignment
     * @param textSize
     * @param useSystemDefault
     */
    public static void addEmojis(Context context, Spannable text, int emojiSize, int emojiAlignment, int textSize, boolean useSystemDefault) {
        addEmojis(context, text, emojiSize, emojiAlignment, textSize, 0, -1, useSystemDefault);
    }

    /**
     * Convert emoji characters of the given Spannable to the according emojicon.
     *
     * @param context
     * @param text
     * @param emojiSize
     * @param emojiAlignment
     * @param textSize
     * @param index
     * @param length
     * @param useSystemDefault
     */
    public static void addEmojis(Context context, Spannable text, int emojiSize, int emojiAlignment, int textSize, int index, int length, boolean useSystemDefault) {
        if (useSystemDefault) {
            return;
        }

        int textLength = text.length();
        int textLengthToProcessMax = textLength - index;
        int textLengthToProcess = length < 0 || length >= textLengthToProcessMax ? textLength : (length + index);

        // remove spans throughout all text
        EmojiconSpan[] oldSpans = text.getSpans(0, textLength, EmojiconSpan.class);
        for (int i = 0; i < oldSpans.length; i++) {
            text.removeSpan(oldSpans[i]);
        }

        int skip;
        for (int i = index; i < textLengthToProcess; i += skip) {
            skip = 0;
            int icon = 0;
            char c = text.charAt(i);
            if (isSoftBankEmoji(c)) {
                icon = getSoftbankEmojiResource(c);
                skip = icon == 0 ? 0 : 1;
            }

            if (icon == 0) {
                int unicode = Character.codePointAt(text, i);
                skip = Character.charCount(unicode);

                if (unicode > 0xff) {
                    icon = getEmojiResource(context, unicode);
                }

                if (i + skip < textLengthToProcess) {
                    int followUnicode = Character.codePointAt(text, i + skip);
                    //Non-spacing mark (Combining mark)
                    if (followUnicode == 0xfe0f) {
                        int followSkip = Character.charCount(followUnicode);
                        if (i + skip + followSkip < textLengthToProcess) {

                            int nextFollowUnicode = Character.codePointAt(text, i + skip + followSkip);
                            if (nextFollowUnicode == 0x20e3) {
                                int nextFollowSkip = Character.charCount(nextFollowUnicode);
                                int tempIcon = getKeyCapEmoji(unicode);

                                if (tempIcon == 0) {
                                    followSkip = 0;
                                    nextFollowSkip = 0;
                                } else {
                                    icon = tempIcon;
                                }
                                skip += (followSkip + nextFollowSkip);
                            }
                        }
                    } else if (followUnicode == 0x20e3) {
                        //some older versions of iOS don't use a combining character, instead it just goes straight to the second part
                        int followSkip = Character.charCount(followUnicode);

                        int tempIcon = getKeyCapEmoji(unicode);
                        if (tempIcon == 0) {
                            followSkip = 0;
                        } else {
                            icon = tempIcon;
                        }
                        skip += followSkip;

                    } else if(sEmojiModifiersMap.get(followUnicode, 0) > 0){
                        //handle other emoji modifiers
                        int followSkip = Character.charCount(followUnicode);
                        
                        
                        //TODO seems like we could do this for every emoji type rather than having that giant static map, maybe this is too slow?
                        String hexUnicode = Integer.toHexString(unicode);
                        String hexFollowUnicode = Integer.toHexString(followUnicode);
                        
                        String resourceName = "emoji_" + hexUnicode + "_" + hexFollowUnicode;
                        
                        int resourceId = 0;
                        if (sEmojisModifiedMap.containsKey(resourceName)) {
                            resourceId = sEmojisModifiedMap.get(resourceName);
                        } else {
                            resourceId = context.getResources().getIdentifier(resourceName, "drawable", context.getApplicationContext().getPackageName());
                            if (resourceId != 0) {
                                sEmojisModifiedMap.put(resourceName, resourceId);
                            }
                        }
                        
                        if (resourceId == 0) {
                            followSkip = 0;
                        } else {
                            icon = resourceId;
                        }
                        skip += followSkip;
                    }
                }
            }

            if (icon > 0) {
                text.setSpan(new EmojiconSpan(context, icon, emojiSize, emojiAlignment, textSize), i, i + skip, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            }
        }
    }

    private static int getKeyCapEmoji(int unicode) {
        int icon = 0;
        switch (unicode) {
            case 0x0023:
                icon = de.veedapp.emojicon.R.drawable.emoji_0023;
                break;
            case 0x002a:
                icon = de.veedapp.emojicon.R.drawable.emoji_002a_20e3;
                break;
            case 0x0030:
                icon = de.veedapp.emojicon.R.drawable.emoji_0030;
                break;
            case 0x0031:
                icon = de.veedapp.emojicon.R.drawable.emoji_0031;
                break;
            case 0x0032:
                icon = de.veedapp.emojicon.R.drawable.emoji_0032;
                break;
            case 0x0033:
                icon = de.veedapp.emojicon.R.drawable.emoji_0033;
                break;
            case 0x0034:
                icon = de.veedapp.emojicon.R.drawable.emoji_0034;
                break;
            case 0x0035:
                icon = de.veedapp.emojicon.R.drawable.emoji_0035;
                break;
            case 0x0036:
                icon = de.veedapp.emojicon.R.drawable.emoji_0036;
                break;
            case 0x0037:
                icon = de.veedapp.emojicon.R.drawable.emoji_0037;
                break;
            case 0x0038:
                icon = de.veedapp.emojicon.R.drawable.emoji_0038;
                break;
            case 0x0039:
                icon = de.veedapp.emojicon.R.drawable.emoji_0039;
                break;
            default:
                break;
        }
        return icon;
    }

}
