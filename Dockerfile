FROM node:18-alpine
WORKDIR /opt/app
COPY artifacts/gate-simulator .
RUN npm install
CMD ["npm", "start"]
EXPOSE 9999