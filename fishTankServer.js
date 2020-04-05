var PROTO_PATH = __dirname + '/fishtank.proto';

var grpc = require('grpc');

var protoLoader = require('@grpc/proto-loader');

var packageDefinition = protoLoader.loadSync(PROTO_PATH, {keepCase:true, longs:String,enums:String,defaults:true,oneofs:true});

var fishTankProto = grpc.loadPackageDefinition(packageDefinition);

function responseWithFishNames(call,callback) {

   callback(null,{message:`Hello ${call.request.name}`});

}

function responseWithFishNamesStream(call) {

    var num_request = call.request.num_response;
    
    for(var i = 0; i < num_request; i++){
        call.write({message:`Hello ${call.request.name} ${i}`});
    }
    call.end();
 }


function startServer() {
var server = new grpc.Server();
server.addService(fishTankProto.fishTank.service,{
    responseWithFishNames:responseWithFishNames,
    responseWithFishNamesStream:responseWithFishNamesStream
});

server.bind('0.0.0.0:9090', grpc.ServerCredentials.createInsecure());
server.start();
}

startServer();