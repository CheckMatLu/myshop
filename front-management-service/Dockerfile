FROM nginx:alpine

COPY ./nginx.conf /ect/nginx/nginx.conf

WORKDIR /usr/share/nginx/html
COPY ./dist/front-management-service/ .