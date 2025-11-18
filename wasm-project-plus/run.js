import fs from "fs";

const wasmBytes = fs.readFileSync("./output.wasm");

const importObject = {
  env: {
    print: (value) => {
      console.log("Output from WASM:", value);
    },
  },
};

const wasmModule = await WebAssembly.compile(wasmBytes);
const instance = await WebAssembly.instantiate(wasmModule, importObject);

// Run exported main function
console.log("Running WebAssembly main...");
instance.exports.main();
