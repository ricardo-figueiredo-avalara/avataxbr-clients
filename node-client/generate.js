var fs = require('fs');
var CodeGen = require('swagger-js-codegen').CodeGen;

var file = 'spec.json';
var swagger = JSON.parse(fs.readFileSync(file, 'UTF-8'));
var nodejsSourceCode = CodeGen.getNodeCode({ className: 'AvaTaxBR', swagger: swagger });
//var angularjsSourceCode = CodeGen.getAngularCode({ className: 'Test', swagger: swagger });
//var tsSourceCode = CodeGen.getTypescriptCode({ className: 'Test', swagger: swagger, imports: ['../../typings/tsd.d.ts'] });
console.log(nodejsSourceCode);
fs.writeFile('avatax-brazil-client.js', nodejsSourceCode);
//console.log(angularjsSourceCode);
//console.log(tsSourceCode);