para = """
Parental/Guardian Consent and Indemnity Form for Child/Ward’s Participation in STACK the Flags
Capture The Flag competition (the “Competition”) organized by Government Technology Agency
By submitting this form on behalf of the child/ward, the parent/guardian acknowledges and agrees
that:
(a) All STACK the Flags Terms and Conditions (“Terms and Conditions”) set out in the registration
form at https://go.gov.sg/csg-ctf shall continue to apply to the child/ward as if the child/ward
had signed this form, and the parent/guardian shall be responsible for ensuring that the
child/ward complies with the same;
(b) The parent/guardian shall be solely responsible for all actions of the child/ward and the Terms
and Conditions shall apply to the parent/guardian, and the parent/guardian agrees to
undertake them on behalf of the child/ward; and
(c) The parent/guardian agrees to be bound by the Terms and Conditions in his/her own right.
The parent/guardian hereby consents to GovTech collecting, using, disclosing and/or processing of
his/her personal data provided in this form for the purposes set out above and for the purpose of
facilitating, arranging and managing the Competition.
This form is governed by the laws of Singapore and the Singapore courts shall have exclusive
jurisdiction to deal with any disputes arising in relation to it.
Contact Information
Please contact ctf@tech.gov.sg if you any other enquiries.

tech.gov.sg
GOVERNMENT TECHNOLOGY AGENCY
10 Pasir Panjang Road #10-01
Mapletree Business City, Singapore 117438
T +65 6211 0888
E info@tech.gov.sg

To be completed by Parent/Guardian (only for participants below the age of 18):
I, _____________________________ (name of parent / guardian) of NRIC/FIN/Passport No.
_______________ am the parent / guardian of ____________________________ (name of child /
ward).
I confirm that I have carefully read this form and the Terms and Conditions, and fully understand this
as a release of any and all future claims or rights of whatsoever nature against GovTech and its
representatives, whether on my behalf or on behalf of my child / ward.
I voluntarily sign and agree to the terms in this form, including but not limited to the indemnity and
waiver and release of liability set out in the Terms and Conditions, with the understanding that
substantial rights are being given up, whether on my behalf or on behalf of my child / ward.

_____________________________________ _____________________
Parent/Legal Guardian’s name and signature Parent/Guardian’s
NRIC/FIN/Passport No.
_____________________________________ ___________________
Parent/Legal Guardian’s Contact Number Date
"""
import re; pattern = re.compile('[\W_]+')

processedText = (para+' '+para.lower()+' '+para.upper())
processedText = pattern.sub(' ', processedText) + ' ' + para

print(processedText)
input()

lst = list(set(processedText.split()) )
print(len(lst))

#https://stackoverflow.com/questions/1276764/stripping-everything-but-alphanumeric-chars-from-a-string-in-python




from zipfile import ZipFile
import sys
successful = []
zip_file = '../secret-files.zip'
with open('consent_word_list.txt', 'w') as f:
    for x in lst:
        try:
            password = x#f"govtech-csg{{{x}}}"
            f.write(x+'\n')
            sys.stdout.write(password+'\n')
            zf.extractall(pwd=bytes(password,'utf-8'))
            successful.append(password)
            break
        except Exception as e:
            #break
            pass

print()
print(successful)
print(len(lst))
