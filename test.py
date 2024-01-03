from fastapi import FastAPI

app = FastAPI()

# Sample data for demonstration purposes
sample_items = {
    1: {"name": "Item 1", "description": "Description for Item 1"},
    2: {"name": "Item 2", "description": "Description for Item 2"},
}

# Define a route for handling GET requests
@app.get("/items/{item_id}")

async def read_item(item_id: int):
    if item_id in sample_items:
        return {"item_id": item_id, **sample_items[item_id]}
    else:
        return {"error": "Item not found"}
    

@app.get("/")
async def getAll():
    return sample_items


# To run the FastAPI application, you can use the following command:
# uvicorn your_file_name:app --reload
# Replace "your_file_name" with the actual name of your Python file.
