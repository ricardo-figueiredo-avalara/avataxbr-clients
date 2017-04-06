'use strict';

const api = require('./avatax-brazil-client'),
    avatax = new api.AvaTaxBR();
let parameters = [];

parameters['authorization'] = 'Basic YWRtLmFtYmV2OmFkbTEyMyE='; //Basic <user:pass in base64
avatax.getAuthorization(parameters).then((data) => {
    let token = data.body.token;
    parameters['authorization'] = 'Bearer ' + token;
    avatax.getAgastList(parameters).then((agasts) => {
        console.log(JSON.stringify(agasts.body));
    });
});