.class public final Lfw$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lfw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field final a:I

.field final b:[Lfw$b;


# direct methods
.method public constructor <init>(I[Lfw$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lfw$a;->a:I

    iput-object p2, p0, Lfw$a;->b:[Lfw$b;

    return-void
.end method
