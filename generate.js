'use strict';

const request = require('request-promise'),
    download = require('download'),
    avataxApi = 'http://avataxbr-sandbox.avalarabrasil.com.br:8000/docs/index/api',
    swaggerCodegen = 'https://generator.swagger.io/api/gen/clients',
    langs = [
        'android',
        'async-scala',
        'bash',
        'clojure',
        'cpprest',
        'csharp',
        'CsharpDotNet2',
        'dynamic-html',
        'go',
        'groovy',
        'html',
        'html2',
        'java',
        'javascript',
        'javascript-closure-angular',
        'jaxrs-cxf-client',
        'objc',
        'perl',
        'php',
        'python',
        'ruby',
        'swift',
        'swift3',
        'typescript-angular',
        'typescript-angular2',
        'typescript-fetch',
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