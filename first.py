from langchain_ollama import ChatOllama
from dotenv import load_dotenv
from langchain_core.prompts import ChatPromptTemplate

#load_dotenv()

# Initialize LLM
# llm = ChatOllama(
#     model="qwen3.5:9b",
#     temperature=0.7,
# )

llm = ChatOllama(
    model="qwen3.5:4b",
    temperature=0.7,
)

# Create Chat Prompt Template
prompt = ChatPromptTemplate.from_messages([
    ("system", "You are a helpful AI assistant."),
    ("human", "{topic}")
])


# Create LCEL chain
chain = prompt | llm

# Invoke chain
response = chain.invoke({
    "topic": "What is the capital of India?"
})

print(response)
print(type(response))