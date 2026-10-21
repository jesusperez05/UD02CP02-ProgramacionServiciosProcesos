Al aumentar los incrementos se obtienen resultados incorrectos e impredecibles debido a una condición de carrera.

Como v++ no es atómica, entre lectura y escritura se pierden incrementos.
