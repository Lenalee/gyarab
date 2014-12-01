;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-beginner-reader.ss" "lang")((modname lists) (read-case-sensitive #t) (teachpacks ((lib "draw.rkt" "teachpack" "htdp"))) (htdp-settings #(#t constructor repeating-decimal #f #t none #f ((lib "draw.rkt" "teachpack" "htdp")))))
(define A (cons 6(cons 9(cons 8(cons 2 empty)))))
(define (len a) (cond [(empty? a) 0] [else (+ 1 (len(rest a)))]))
(define (sum a) (cond [(empty? a) 0] [else (+ (first a) (sum (rest a)))]))
(define (avg s) (cond [(empty? s) 0] [else (/ (sum s) (len s))]))
(define (mul a) (cond [(empty? a) 1] [else (* (first a) (mul (rest a)))]))
(define (root n p) (exp (* (/ 1 n) (log p))))
(define (geo b) (root (len b) (mul b)))
