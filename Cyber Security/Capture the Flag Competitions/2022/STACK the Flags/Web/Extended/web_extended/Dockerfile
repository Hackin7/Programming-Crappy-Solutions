FROM php:8.1-apache

RUN docker-php-ext-install pdo pdo_mysql && docker-php-ext-enable pdo_mysql

ENV SECRET="REDACTED" 

ENV mysqluser="REDACTED"
ENV mysqlpass="REDACTED"

WORKDIR /var/www/html
COPY ./src/app /var/www/html

RUN chown -R www-data:www-data /var/www/html
RUN chmod 775 /var/www/html/*

