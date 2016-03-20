package org.moflon.maave.tool.smt.solverutil;

import com.microsoft.z3.Status;

public class test
{

   public static void main(String[] args)
   {
      

      for (int i = 0; i < 1000; i++)
      {
         Z3AttribSolver solver =new Z3AttribSolver();
         String smtStr=new String("(set-option :timeout 10000)\n (declare-const entry_studentId!20 Int)\n(declare-const enrollment_cp_prime!12 Int)\n(declare-const moduleOffer_cp!5 Int)\n(declare-const rec_grade_prime!22 Int)\n(declare-const student_id!10 Int)\n(declare-const enrollment_cp!19 Int)\n(declare-const entry_grade!9 Int)\n(declare-const entry_grade!21 Int)\n(declare-const moduleOffer_cp!18 Int)\n(declare-const entry_studentId!8 Int)\n(declare-const rec_grade_prime!11 Int)\n(define-fun geNAT ((x!0 Int)(x!1 Int)) Bool(> x!0 x!1))\n(define-fun addNat ((x!0 Int)(x!1 Int)(x!2 Int)) Bool(= x!0 (+ x!1 x!2)))\n(define-fun isLeqNAT ((x!0 Int)(x!1 Int)(x!2 Bool)) Bool(= (<= x!0 x!1) x!2))\n(define-fun iteNAT ((x!0 Bool)(x!1 Int)(x!2 Int)(x!3 Int)) Bool(and  (=> x!0 (= x!1 x!2))  (=> (not x!0) (= x!1 x!3))))\n(define-fun eqNAT ((x!0 Int)(x!1 Int)) Bool(= x!0 x!1))\n(define-fun leqNAT ((x!0 Int)(x!1 Int)) Bool(<= x!0 x!1))\n(assert\n(not\n(=\n(exists((rec_grade_prime!!0 Int) (enrollment_cp_prime!!1 Int) (passed!!2 Bool) (newCP!!3 Int) (rec_grade_prime!!4 Int) (enrollment_cp_prime!!5 Int) (passed!!6 Bool) (newCP!!7 Int) (enrollment_cp_prime!!8 Int) (passed!!9 Bool) (newCP!!10 Int) (passed!!11 Bool) (newCP!!12 Int) ) (and (eqNAT student_id!10 entry_studentId!20) (leqNAT entry_grade!21 5) (geNAT entry_grade!21 0) (eqNAT rec_grade_prime!!4 entry_grade!21) (isLeqNAT entry_grade!21 4 passed!!6) (iteNAT passed!!6 enrollment_cp_prime!!5 newCP!!7 enrollment_cp!19) (addNat newCP!!7 enrollment_cp!19 moduleOffer_cp!18) (eqNAT student_id!10 entry_studentId!8) (leqNAT entry_grade!9 5) (geNAT entry_grade!9 0) (eqNAT rec_grade_prime!!0 entry_grade!9) (isLeqNAT entry_grade!9 4 passed!!2) (iteNAT passed!!2 enrollment_cp_prime!!1 newCP!!3 enrollment_cp!19) (addNat newCP!!3 enrollment_cp!19 moduleOffer_cp!5) (eqNAT student_id!10 entry_studentId!20) (leqNAT entry_grade!21 5) (geNAT entry_grade!21 0) (eqNAT rec_grade_prime!22 entry_grade!21) (isLeqNAT entry_grade!21 4 passed!!11) (iteNAT passed!!11 enrollment_cp_prime!!8 newCP!!12 enrollment_cp!19) (addNat newCP!!12 enrollment_cp!19 moduleOffer_cp!18) (eqNAT student_id!10 entry_studentId!8) (leqNAT entry_grade!9 5) (geNAT entry_grade!9 0) (eqNAT rec_grade_prime!11 entry_grade!9) (isLeqNAT entry_grade!9 4 passed!!9) (iteNAT passed!!9 enrollment_cp_prime!12 newCP!!10 enrollment_cp_prime!!8) (addNat newCP!!10 enrollment_cp_prime!!8 moduleOffer_cp!5) )  )\n (exists((rec_grade_prime!!0 Int) (enrollment_cp_prime!!1 Int) (passed!!2 Bool) (newCP!!3 Int) (rec_grade_prime!!4 Int) (enrollment_cp_prime!!5 Int) (passed!!6 Bool) (newCP!!7 Int) (enrollment_cp_prime!!8 Int) (passed!!9 Bool) (newCP!!10 Int) (passed!!11 Bool) (newCP!!12 Int) ) (and (eqNAT student_id!10 entry_studentId!8) (leqNAT entry_grade!9 5) (geNAT entry_grade!9 0) (eqNAT rec_grade_prime!!4 entry_grade!9) (isLeqNAT entry_grade!9 4 passed!!6) (iteNAT passed!!6 enrollment_cp_prime!!5 newCP!!7 enrollment_cp!19) (addNat newCP!!7 enrollment_cp!19 moduleOffer_cp!5) (eqNAT student_id!10 entry_studentId!20) (leqNAT entry_grade!21 5) (geNAT entry_grade!21 0) (eqNAT rec_grade_prime!!0 entry_grade!21) (isLeqNAT entry_grade!21 4 passed!!2) (iteNAT passed!!2 enrollment_cp_prime!!1 newCP!!3 enrollment_cp!19) (addNat newCP!!3 enrollment_cp!19 moduleOffer_cp!18) (eqNAT student_id!10 entry_studentId!20) (leqNAT entry_grade!21 5) (geNAT entry_grade!21 0) (eqNAT rec_grade_prime!22 entry_grade!21) (isLeqNAT entry_grade!21 4 passed!!11) (iteNAT passed!!11 enrollment_cp_prime!!8 newCP!!12 enrollment_cp!19) (addNat newCP!!12 enrollment_cp!19 moduleOffer_cp!18) (eqNAT student_id!10 entry_studentId!8) (leqNAT entry_grade!9 5) (geNAT entry_grade!9 0) (eqNAT rec_grade_prime!11 entry_grade!9) (isLeqNAT entry_grade!9 4 passed!!9) (iteNAT passed!!9 enrollment_cp_prime!12 newCP!!10 enrollment_cp_prime!!8) (addNat newCP!!10 enrollment_cp_prime!!8 moduleOffer_cp!5) )  )\n )\n )  )\n(check-sat) ");

         Status s=solver.check(smtStr);
         System.out.println(s.toString());
      }   
   }


}