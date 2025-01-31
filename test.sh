#!/bin/bash
if grep -q "ERROR" my_log_file.log; then
    exit 1  # Bug found → bad commit
else
    exit 0  # No bug → good commit
fi

