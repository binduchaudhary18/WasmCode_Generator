(module
  (import "env" "print" (func $print (param i32)))
  (func (export "main")
    (i32.const 1) (i32.const 2) (i32.const 3) i32.mul i32.add call $print
  )
)
