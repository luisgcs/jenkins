import unittest
import programa

class TestePrograma(unittest.TestCase):
    def setUp(self):
        pass

    def testMultiply(self):
        self.assertEqual(programa.multiply(a=2, b=4), 8)

    def testDivide(self):
        self.assertEqual(programa.divide(a=12, b=6), 2)

    def testDivideByZero(self):
        self.assertEqual(programa.divide(a=10, b=0), 2)
    
    def testOdd(self):
        self.assertTrue(programa.odd(a=5))

    def testEven(self):
        self.assertNotIsInstance(programa.even(a=6), bool)
    
    def testEvenTrue(self):
        self.assertIs(programa.even(a=6), True)

if __name__ == '__main__':
    unittest.main()