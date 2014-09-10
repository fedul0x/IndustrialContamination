#!/usr/bin/zsh

sudo -i -u postgres
/usr/bin/pg_ctl -s -D /var/lib/postgres/data start -w -t 120 &