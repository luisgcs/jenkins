require "./HelloWorld"

describe HelloWorld do 
   it "deve aparecer a mensagem: Hello World" do 
      hw = HelloWorld.new 
      message = hw.say_hello 
      expect(message).to eq "Hello World!!"
   end
 end