'use strict';

const request = require('request-promise'),
    download = require('download'),
    avataxApi = 'http://avataxbr-sandbox.avalarabrasil.com.br:8000/docs/index/api',
    swaggerCodegen = 'https://generator.swagger.io/api/gen/clients',
    langs = [
        'csharp',
        'CsharpDotNet2',
        'dynamic-html',
        'java',
        'javascript',
        'typescript-angular2',
        'typescript-node'
    ];

langs.forEach((lang) => {
    let optionsPost = {
        url: `${swaggerCodegen}/${lang}`,
        method: 'POST',
        json: true,
        rejectUnauthorized: false,
        body: {
            'swaggerUrl': `${avataxApi}`
        }
    };

    request(optionsPost).then((data) => {
        console.log(`code: ${data.code} | link: ${data.link}`);
        download(data.link, './', { rejectUnauthorized: false, extract: true });
    }).catch((err) => {
        throw err;
    });
});