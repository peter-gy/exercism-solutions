#!/usr/bin/env bash

main() {
    # Use the first passed argument for the name, or "you" as the default value
    local name="${1:-you}"
    echo "One for ${name}, one for me."
}

main "$@"