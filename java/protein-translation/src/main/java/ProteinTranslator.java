import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

class ProteinTranslator {

    private enum Protein {
        METHIONINE, PHENYLALANINE, LEUCINE, SERINE, TYROSINE, CYSTEINE, TRYPTOPHAN, STOP;

        @Override
        public String toString() {
            return super.toString().charAt(0) + super.toString().toLowerCase().substring(1);
        }
    }

    private enum Codon {
        AUG(Protein.METHIONINE), UUU(Protein.PHENYLALANINE), UUC(Protein.PHENYLALANINE),
        UUA(Protein.LEUCINE), UUG(Protein.LEUCINE),
        UCU(Protein.SERINE), UCC(Protein.SERINE), UCA(Protein.SERINE), UCG(Protein.SERINE),
        UAU(Protein.TYROSINE), UAC(Protein.TYROSINE),
        UGU(Protein.CYSTEINE), UGC(Protein.CYSTEINE),
        UGG(Protein.TRYPTOPHAN),
        UAA(Protein.STOP), UAG(Protein.STOP), UGA(Protein.STOP);

        private final Protein protein;

        Codon(Protein protein) {
            this.protein = protein;
        }

        public Protein getProtein() {
            return protein;
        }
    }

    List<String> translate(String rnaSequence) {
        AtomicInteger counter = new AtomicInteger();
        List<String> resultWithStopProteins = rnaSequence.chars()
                .mapToObj(i -> "" + (char) i)
                .collect(Collectors.groupingBy(character -> counter.getAndIncrement() / 3))
                .values()
                .stream()
                .map(strings -> String.join("", strings))
                .map(Codon::valueOf)
                .map(Codon::getProtein)
                .map(Protein::toString)
                .collect(Collectors.toList());

        return resultWithStopProteins.contains("Stop")
                ? resultWithStopProteins.subList(0, resultWithStopProteins.indexOf("Stop"))
                : resultWithStopProteins;
    }

}
