(nil? 1)

(nil? nil)

(= 1 1)
(= nil nil)
(= 1 2)


(or false nil :large_I_mean_venti :why_cant_I_just_say_large)

(or false nil false)

(and true "yes" 1 :worth)
(and false "no" 1 :worth) 
(or nil)

(def failed-protagonist-names
  ["Larry Potter" "Doreen the Explorer" "The Incredible Bulk"])

(defn error-message
  [severity]
  (str "OH GOD! IT'S A DISASTER! WE'RE ALL "
       (if (= severity :mild)
         "MILDLY INCONVENIENCED!"
         "DOOOOOOOOMED!")))