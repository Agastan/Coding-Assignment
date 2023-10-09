function reverseWordsInSentence(sentence) {
    const words = sentence.split(' ');
    const reversedWords = words.map(word => word.split('').reverse().join(''));
    const reversedSentence = reversedWords.join(' ');

    return reversedSentence;
}

const sentence = "Hello, how are you?";
const reversedSentence = reverseWordsInSentence(sentence);
console.log(reversedSentence); 