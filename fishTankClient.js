var PROTO_PATH = __dirname + '/fishtank.proto';

var grpc = require('grpc');

var protoLoader = require('@grpc/proto-loader');

var packageDefinition = protoLoader.loadSync(PROTO_PATH, {keepCase:true, longs:String, enums:String, defaults:true, oneofs:true});

var fishTankProto = grpc.loadPackageDefinition(packageDefinition);


function configureClient(){
    var client = new fishTankProto.fishTank('localhost:9090',grpc.credentials.createInsecure());

    client.responseWithFishNames({name:'Bubbles'}, function (err,response) {

            console.log(`Response: ${response.name}`);
    });

   var call = client.responseWithFishNamesStream({name:'BubblesStream',num_response: 5});

   call.on('data',function(response){

    console.log(`Response: ${response.name}`);

   });

call.on(`end`, function(){

    console.log("end ");

});


}

configureClient();