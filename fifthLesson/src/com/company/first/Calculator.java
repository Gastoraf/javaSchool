package com.company.first;

public interface Calculator {
    @Cache
    int calc(int arg);
}
