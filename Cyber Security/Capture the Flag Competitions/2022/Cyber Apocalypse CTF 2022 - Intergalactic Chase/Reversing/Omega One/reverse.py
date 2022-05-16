matching = [
    ["k", "Lendrens"],
    ["d", "Thauv\'i"],
    ["P", "Throrqiek"],
    ["e", "Inqods"],
    ["6", "Tarquts"],
    ["p", "Dut"],
    ["A", "Krolkel"],
    ["n", "Emoi"],
    ["|", "Dakroith"],
    ["*", "Creiqex"],
    ["Y", "Thomois"],
    ["4", "Groz\'ens"],
    ["D", "Urqek"],
    ["v", "Nid"],
    ["H", "Crerceon"],
    ["#", "Yonphie"],
    ["S", "Xits"],
    ["I", "Thohul"],
    ["W", "Zahrull"],
    ["i", "Om\'ons"],
    ["F", "Kradraks"],
    ["+", "Ielkul"],
    ["q", "Vranix"],
    ["M", "Trun"],
    ["h", "Craz\'ails"],
    [".", "Xoq\'an"],
    ["r", "Ukox"],
    ["N", "Evods"],
    [";", "Taxan"],
    ["b", "Munis"],
    ["g", "Trurkror"],
    ["?", "Tulphaer"],
    ["_", "Ehnu"],
    ["$", "Krets"],
    [",", "Grons"],
    [")", "Ingell"],
    ["(", "Ecruns"],
    ["m", "Khehlan"],
    ["R", "Velzaeth"],
    ["Q", "Cuhix"],
    ["l", "Vinzo"],
    ["E", "Istrur"],
    [">", "Zuvas"],
    ["s", "Honzor"],
    ["0", "Ukteils"],
    ["}", "Baadix"],
    ["{", "Zonnu"],
    ["\\", "Aarcets"],
    ["[", "Nevell"],
    ["!", "Dhohmu"],
    ["X", "Xan"],
    ["O", "Zissat"],
    ["x", "Iscax"],
    ["t", "Pheilons"],
    ["`", "Ghiso"],
    ["-", "Scrigvil"],
    ["B", "Ummuh"],
    ["u", "Inphas"],
    ["/", "Vurqails"],
    ["a", "Vruziels"],
    [":", "Ghut\'ox"],
    ["^", "Aahroill"],
    ["L", "Gairqeik"],
    ["U", "Qeks"],
    ["\'", "Scuvvils"],
    ["3", "Ohols"],
    ["5", "Som\'ir"],
    ["C", "Onzear"],
    ["2", "Dhaesux"],
    ["w", "Falnain"],
    [" ", "Draalpho"],
    ["G", "Yemor"],
    ["c", "Thraurgok"],
    ["\"", "Vogeath"],
    ["1", "Cuzads"],
    ["Z", "Gagro"],
    ["=", "Zad"],
    ["f", "Dhieqe"],
    ["&", "Xustrek"],
    ["o", "Harned"],
    ["V", "Dhulgea"],
    ["y", "Zimil"],
    ["z", "Thretex"],
    ["8", "Bravon"],
    ["%", "Krugreall"],
    ["J", "Vaendred"],
    ["@", "Osux"],
    ["T", "Ezains"],
    ["K", "Mik\'ed"],
    ["<", "Cruz\'oll"],
    ["]", "Dhognot"],
    ["7", "Drids"],
    ["9", "Drercieks"],
    ["j", "Statars"],
]


data = """
Crerceon
Ezains
Ummuh
Zonnu
Vinzo
Cuzads
Emoi
Ohols
Groz'ens
Ukox
Ehnu
Pheilons
Cuzads
Khehlan
Ohols
Ehnu
Munis
Inphas
Pheilons
Ehnu
Dut
Ukox
Ohols
Pheilons
Pheilons
Zimil
Ehnu
Honzor
Vinzo
Ukteils
Falnain
Dhohmu
Baadix
"""

for out, inn in matching:
    data.replace(inn, out)

print(data)
