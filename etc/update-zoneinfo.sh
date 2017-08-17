#!/usr/bin/env bash
docker pull benfortuna/tzurl && \
    docker run -v $(pwd)/src/main/resources/zoneinfo-outlook:/zoneinfo-outlook -it benfortuna/tzurl rsync -av --delete /usr/local/apache2/htdocs/zoneinfo-outlook / && \
    docker run -v $(pwd)/src/main/resources/zoneinfo-outlook-global:/zoneinfo-outlook-global -it benfortuna/tzurl rsync -av --delete /usr/local/apache2/htdocs/zoneinfo-outlook-global /
