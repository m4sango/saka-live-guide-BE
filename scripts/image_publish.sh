#!/bin/sh
cd /Users/muramatsusho/IdeaProjects/saka-live-guide/saka-live-guide-BE
docker build . -t masango1022/saka-live-guide-be
docker push masango1022/saka-live-guide-be:latest