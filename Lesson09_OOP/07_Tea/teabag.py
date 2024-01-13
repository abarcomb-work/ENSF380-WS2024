"""
Copyright Khawla Shnaikat and ChatGPT 3.5, 2023
Licensed under GPL v3
See LICENSE.txt for more information.
"""
class Teabag:
    UNKWN = "unknown"

    def __init__(self, tea_type="samdayeon", tea_origin="Korea", tea_brand=UNKWN):
        self.tea_type = tea_type
        self.tea_origin = tea_origin
        self.tea_brand = tea_brand

    def get_tea_type(self):
        return self.tea_type

    def get_tea_origin(self):
        return self.tea_origin

    def get_tea_brand(self):
        return self.tea_brand
