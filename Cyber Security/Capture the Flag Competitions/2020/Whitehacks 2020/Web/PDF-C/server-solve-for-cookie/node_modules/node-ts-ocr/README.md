# Node Typescript OCR

[![License][license-image]][license-url]
[![Current Version](https://img.shields.io/npm/v/node-ts-ocr.svg)](https://www.npmjs.com/package/node-ts-ocr)
[![npm](https://img.shields.io/npm/dw/node-ts-ocr.svg)](https://www.npmjs.com/package/node-ts-ocr)
![](https://img.shields.io/bundlephobia/min/node-ts-ocr.svg?style=flat)

[license-url]: https://opensource.org/licenses/MIT
[license-image]: https://img.shields.io/npm/l/make-coverage-badge.svg

A simple wrapper around command-line utils to assist in PDF / Image OCR (Optical Character Recognition) processing using [Tesseract](https://github.com/tesseract-ocr/tesseract).

## Test Coverage

![Coverage lines](https://raw.githubusercontent.com/nicolaspearson/node.ts.ocr/master/coverage/badge-lines.svg?sanitize=true)
![Coverage functions](https://raw.githubusercontent.com/nicolaspearson/node.ts.ocr/master/coverage/badge-functions.svg?sanitize=true)
![Coverage branches](https://raw.githubusercontent.com/nicolaspearson/node.ts.ocr/master/coverage/badge-branches.svg?sanitize=true)
![Coverage statements](https://raw.githubusercontent.com/nicolaspearson/node.ts.ocr/master/coverage/badge-statements.svg?sanitize=true)

## Installation

`npm install node-ts-ocr --save`

## Dependencies

After installing node.ts.ocr, the following binaries need to be on your system, as well as in the paths in your environment settings.

### PDF To Text & PDF Info

Many PDF's already have plain text embedded in them, either because they were born-digital (i.e. created from a word processing document) or because OCR was already performed on them. If we are able to extract the text using this utility we do not need to perform image conversion and subsequently OCR.

**OSX**

`pdftotext` & `pdfinfo` are included as part of the `xpdf` utilities library.

```bash
brew install xpdf
```

**Ubuntu**

`pdftotext` & `pdfinfo` are included in the `poppler-utils` library.

```bash
sudo apt-get install poppler-utils
```

**CLI Example**

Attempt to extract the text from a PDF:

```bash
pdftotext /path/to/document.pdf output.txt
```

### ImageMagick & Ghostscript

A PDF is a jumble of instructions for how to render a document on a screen or page. Although it may contain images, a PDF is not itself an image, and therefore we can't perform OCR on it directly. To convert PDF's to images, we use [ImageMagick's](https://www.imagemagick.org/) convert function which depends on [Ghostscript](https://www.ghostscript.com/).

**OSX**

```bash
brew install imagemagick
brew install gs
```

**Ubuntu**

```bash
sudo apt-get update
sudo apt-get install imagemagick --fix-missing
sudo apt-get install ghostscript
```

**CLI Example**

Convert a PDF to a TIFF representation:

```bash
convert -density 300 /path/to/document.pdf -depth 8 -strip -background white -alpha off image.tiff
```

### Tesseract

Tesseract is Open Source OCR Engine.

**OSX**

```bash
brew install tesseract
```

**Ubuntu**

```bash
sudo apt-get install tesseract-ocr
```

**CLI Example**

Once we have a TIFF representation of the document, we can use Tesseract to (attempt to) extract the plain text:

```bash
tesseract image.tiff output.txt
```

## Usage

```typescript
import { Ocr } from 'node-ts-ocr';
import * as path from 'path';
import * as temp from 'temp';

export async function getPdfText(fileName: string): Promise<string> {
	// Assuming your file resides in a directory named sample
	const relativePath = path.join('sample', fileName);
	const filePath = path.join(__dirname, relativePath);
	// Extract the text and return the result
	return await Ocr.extractText(filePath);
}
```

### Methods

**`extractInfo(filePath: string)`**

Retrieve the pdf info using the pdfinfo binary and parse the result to a key value object.

**`extractText(filePath: string, options?: ExtractTextOptions)`**

Extracts the text from the pdf using the pdftotext binary

**`invokePdfToTiff(outDir: string, filePath: string, options?: ExtractTextOptions)`**

Converts a PDF file to its TIFF representation using the convert binary

**`invokeImageOcr(outDir: string, imagePath: string, options?: ExtractTextOptions)`**

Performs OCR on an image in order to extract the text using the tesseract binary

### Options

**`ExtractTextOptions`**

The arguments are key value pairs of valid command line arguments for the respective binary.

```
ExtractTextOptions {
  pdfToTextArgs?: KeyValue;
  convertArgs?: KeyValue;
  tesseractArgs?: KeyValue;
}
```

Example `pdfToTextArgs` that only includes page 1 to 4.

Note: this will only work if you already have a searchable PDF, because the `pdftotext` binary can only be used to extract text from a searchable PDF.

```
{ pdfToTextArgs: { f: 1, l: 4 } }
```

Example `convertArgs` that sets the convert density to 600, and the trim option to on.

```
{ convertArgs: { density: '600', trim: '' } }
```

Example `tesseractArgs` that sets the language to english, the page segmentation mode to 6, and preserves interword spaces.

```
{ tesseractArgs: { 'l': 'eng', '-psm': 6, 'c': 'preserve_interword_spaces=1' } }
```

## Docker

Coming Soon...
