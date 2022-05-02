#!/usr/bin/env bash

main() {
    if (($# != 2)); then
        echo "Usage: hamming.sh <string1> <string2>"
        exit 1
    fi
    local s1="$1"
    local s2="$2"
    if ((${#s1} != ${#s2})); then
        echo "strands must be of equal length"
        exit 1
    fi
    local distance=0
    for ((i = 0; i < ${#s1}; i++)); do
        if [[ "${s1:$i:1}" != "${s2:$i:1}" ]]; then
            ((distance++))
        fi
    done
    echo "$distance"
}

main "$@"