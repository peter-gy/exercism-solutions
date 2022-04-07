from itertools import takewhile
from textwrap import wrap


catalogue = {
    'AUG': 'Methionine',
    'UUC': 'Phenylalanine',
    'UUU': 'Phenylalanine',
    'UUA': 'Leucine',
    'UUG': 'Leucine',
    'UCU': 'Serine',
    'UCC': 'Serine',
    'UCA': 'Serine',
    'UCG': 'Serine',
    'UAC': 'Tyrosine',
    'UAU': 'Tyrosine',
    'UGC': 'Cysteine',
    'UGU': 'Cysteine',
    'UGG': 'Tryptophan',
}


def is_not_stop(pattern):
    return pattern not in ('UAG', 'UAA', 'UGA')


def proteins(strand):
    print(wrap(strand, 3))
    return [protein
            for codon in takewhile(is_not_stop, wrap(strand, 3)) # considering codons only while a 'STOP' codon is not reached
            for protein in (catalogue.get(codon),) # tuple with a single element
            if protein] # eliminating codons not existing in catalogue
