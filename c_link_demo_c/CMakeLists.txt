cmake_minimum_required(VERSION 3.27)
project(c_link_demo_c C)

set(CMAKE_C_STANDARD 11)

add_library(c_link_demo_c STATIC library.c)
