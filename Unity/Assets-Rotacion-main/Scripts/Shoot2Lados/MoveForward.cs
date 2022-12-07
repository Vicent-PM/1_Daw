using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class MoveForward : MonoBehaviour
{
    [SerializeField] private float speed;

    // Update is called once per frame
    void Update()
    {
        Vector3 direction = transform.forward;
        Vector3 velocity = direction * speed;
        Vector3 displacement = velocity * Time.deltaTime;
        
        transform.Translate(displacement);
    }
}
