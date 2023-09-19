package com.munsun.patterns.dz.solid;

import java.util.UUID;

public interface Online {
    UUID order(String product, int count);
}