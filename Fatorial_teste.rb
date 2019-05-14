require "./Fatorial"

describe Factorial do
    calculator = Factorial.new
    it "fatorial de 5" do
        expect(calculator.factorial_of(5)).to eq(120)
        expect(calculator.factorial_of(5)).to eq(110)
    end

    it "fatorial de 0" do
        expect(calculator.factorial_of(1)).to eq(1)
    end
end