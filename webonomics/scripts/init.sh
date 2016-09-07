#! /bin/bash

# Update the apt

# sudo apt-get update

# Install packages.

# sudo apt-get install -y libapache2-mod-php5 akonadi-backend-mysql             libdbd-mysql-perl                 libmysqlclient-dev                libmysqlclient18:amd64            libqt4-sql-mysql:amd64            mysql-client                      mysql-client-5.5                  mysql-client-core-5.5             mysql-common                      mysql-server                      mysql-server-5.5                  mysql-server-core-5.5             php5-mysql                        apache2                apache2-bin            apache2-data           libapache-pom-java     libapache2-mod-php5    libapache2-mod-wsgi-py3 libbatik-java          libapache2-mod-php5        php-console-table          php-gettext                php-pear                   php5                       php5-cli                   php5-common                php5-gd                    php5-json                  php5-mcrypt                php5-mysql                 phpmyadmin                 


echo "Enter your MYSQL password, not machine password"

read pass

mysqladmin -u root "-p$pass" drop myzone

mysqladmin -u root "-p$pass" create myzone

mysql -u root "-p$pass"  myzone < myzone.sql
