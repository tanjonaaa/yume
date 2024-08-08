package com.yume.pdp.file;

import com.yume.pdp.PojaGenerated;

@PojaGenerated
public record FileHash(FileHashAlgorithm algorithm, String value) {}
