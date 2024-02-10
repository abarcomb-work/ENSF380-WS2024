"""
Copyright Khawla Shnaikat and ChatGPT 3.5, 2023
Licensed under GPL v3
See LICENSE.txt for more information.
To run these tests: 
- Open a terminal or command prompt.
- Navigate to the directory where test_books.py and books.py are saved on your device.
- Run the tests by typing python -m unittest test_books.py.
"""
import unittest
from books import Anthology, Novel, Nonfiction

class BooksTest(unittest.TestCase):

    def test_check_relationship_anthology_cover_art(self):
        anthology = Anthology()
        expected = "Method coverArt called from Anthology"
        self.assertEqual(expected, anthology.cover_art())

    def test_anthology_default_constructor(self):
        new_anthology = Anthology()
        self.assertIsNotNone(new_anthology)

    def test_anthology_inherited_constructor(self):
        isbn = "0987654321"
        pages = 10
        new_anthology = Anthology(isbn, pages)
        self.assertIsNotNone(new_anthology)

    def test_paperback_cover_art(self):
        new_nf = Nonfiction()
        expected = "Method coverArt called from Paperback"
        self.assertEqual(expected, new_nf.cover_art())

    def test_check_relationship_novel_cover_art(self):
        novel = Novel()
        expected = "Method coverArt called from Novel"
        self.assertEqual(expected, novel.cover_art())

    def test_fiction_genre(self):
        antho = Anthology()
        expected = "Method genre called from Fiction"
        self.assertEqual(expected, antho.genre())

    def test_check_relationship_nonfiction_topic(self):
        nonfiction = Nonfiction()
        expected = "Method topic called from Nonfiction"
        self.assertEqual(expected, nonfiction.topic())

if __name__ == '__main__':
    unittest.main()
