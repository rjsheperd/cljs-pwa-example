(ns pwa.worker)

(defn message-received [e]
  (let [data (.-data e)]
    (println "Worker received message:" data)
    ;; Process the data
    ;; ...
    ;; Post a message back to the main thread
    (.postMessage js/self (str "Processed: " data))))

(.addEventListener js/self "message" message-received)
