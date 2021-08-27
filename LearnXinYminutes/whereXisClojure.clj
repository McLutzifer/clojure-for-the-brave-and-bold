; Comments start with semicolons.

; The clojure reader assumes that the first thing is a
; function or macro to call, and the rest are arguments.

; The first call in a file should be ns, to set the namespace

(ns learnclojure)

; more basic examples:

; str will create a string out of all its arguments
(str "Hello" " " "World") ; => "hello World"